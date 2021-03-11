package alex.learn.threads.tickets;

import java.util.ArrayList;
import java.util.List;

/**
 * author  : zhiguang
 * date    : 2018/8/8
 */
public class ThreadDemo6 {

    private static volatile int ticket=500;

    public static void main(String[] args){
        for (int i=0;i<8;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //设置线程执行条件
                    while(ticket>0){
                        //加锁
                        synchronized (this.getClass()){
                            //再次检查, 忽然觉得这和doublecheck好像
                            if(ticket<=0){
                                break;
                            }else {
                                ticket=ticket-1;
                            }
                            //模拟其它业务
                            try {
                                System.out.println(Thread.currentThread().getName()+"  "+ticket);
                                Thread.sleep(2);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }
            },("窗口"+i)).start();

        }
    }

}
