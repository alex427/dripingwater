package alex.learn.threads.pools;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {

    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue(10);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 5, 60, TimeUnit.SECONDS, queue);
        pool.execute(new TaskD());
        pool.execute(new TaskA());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        pool.shutdownNow();

    }


    private static class TaskA implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 50000; i++) {
                if (!Thread.currentThread().isInterrupted()) {
                    //很扯淡，一旦线程池里面的线程进入Runnable状态，在外面就外面就改变不了。
                    System.out.println(Thread.currentThread().getName() + " aaaaa " + Thread.currentThread().getState() + "  " + Thread.currentThread().isInterrupted());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                } else {
                    return;
                }
            }
        }
    }
}


class TaskD implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            if (!Thread.currentThread().isInterrupted()) {
                //很扯淡，一旦线程池里面的线程进入Runnable状态，在外面就外面就改变不了。
                System.out.println(Thread.currentThread().getName() + " ddddd " + Thread.currentThread().getState() + "  " + Thread.currentThread().isInterrupted());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            } else {
                return;
            }
        }
    }
}