package alex.learn.threads.master_worker;

import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by zhiguang on 2017/10/19.
 */
public class Worker implements Runnable {

    private ConcurrentLinkedQueue<Task> taskqueue;
    private HashMap<String, Integer> resultset;

    public Worker(ConcurrentLinkedQueue<Task> taskqueue, HashMap<String, Integer> resultset) {
        this.taskqueue=taskqueue;
        this.resultset=resultset;
    }

    public void run() {
        while(true){
            Task task = this.taskqueue.poll();
            if(task != null){

                //模拟任务执行
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int result = task.getAmount()*10;
                System.out.println(Thread.currentThread().getName()+" is working");
                //写入结果集
                this.resultset.put(task.getName(),result);
            } else {
                break;
            }
        }

    }
}
