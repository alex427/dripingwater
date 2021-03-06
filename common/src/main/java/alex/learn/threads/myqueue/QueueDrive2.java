package alex.learn.threads.myqueue;

/**
 * Created by zhiguang on 2017/10/16.
 */
public class QueueDrive2 {
    public static void main(String[] args) throws InterruptedException {
        final MyQueue2 queue = new MyQueue2(5);
        queue.put("a");
        queue.put("b");
        queue.put("c");
        queue.put("d");
        queue.put("e");

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName()+" put "+queue.put("f"));
                System.out.println(Thread.currentThread().getName()+" put "+queue.put("g"));
            }
        },"t1");
        t1.start();

        Thread.sleep(2000);

        Thread t2 = new Thread(new Runnable() {
            public void run() {
               System.out.println(Thread.currentThread().getName()+" take "+ queue.take());;
               System.out.println(Thread.currentThread().getName()+" take "+ queue.take());;
            }
        },"t2");
        t2.start();
    }
}
