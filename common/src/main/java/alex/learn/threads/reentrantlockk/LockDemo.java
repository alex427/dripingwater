package alex.learn.threads.reentrantlockk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * author  : zhiguang
 * date    : 2018/8/8
 */
public class LockDemo {
    public static void main(String[] args){

        BusinessService bs = new BusinessService();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i=0;i<1000;i++){
                        bs.worka();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i=0;i<1000;i++){
                        bs.workb();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i=0;i<1000;i++){
                        bs.workc();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}

//业务类
class BusinessService {

    //全局标记
    private volatile int flag=0;
    //锁
    private Lock lock = new ReentrantLock();
    //条件
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    //该方法的执行条件是flag==0, 定向唤醒方法2
    public void worka() throws InterruptedException {
        lock.lock();
        try {
            //设置当前线程等待的条件
            if(flag !=0){
                c1.await();
            }
            System.out.print("Hello ");
            System.out.print("world ");
            System.out.print(" ...... ");
            System.out.println(" --------aaaaaaaa------------- ");
            flag=1;
            c2.signal();
        } finally {
            lock.unlock();
        }
    }

    //该方法的执行条件是flag==1, 定向唤醒方法3
    public void workb() throws InterruptedException {
        lock.lock();
        try {
            //设置当前线程等待的条件
            if(flag !=1){
                c2.await();
            }
            System.out.print("Jimmy ");
            System.out.print("Kate ");
            System.out.print(" ...... ");
            System.out.println(" ---------bbbbbb------------- ");
            flag=2;
            c3.signal();
        } finally {
            lock.unlock();
        }
    }

    //该方法的执行条件是flag==2，定向唤醒c4
    public void workc() throws InterruptedException {
        lock.lock();
        try {
            //设置当前线程等待的条件
            if(flag !=2){
                c3.await();
            }
            System.out.print("Jackson ");
            System.out.print("databind ");
            System.out.print(" ...... ");
            System.out.println(" -----cccccc------------- ");
            flag=0;
            c1.signal();
        } finally {
            lock.unlock();
        }
    }

}