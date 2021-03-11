package alex.learn.threads.pools;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(5);
        System.out.println(pool);
        pool.execute(new TaskA());
        pool.execute(new TaskB());
        //pool.execute(new TaskA());//为什么明明设置的是2个，我启动3个线程，不报错。

        try {
            pool.shutdownNow();
            if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                pool.shutdownNow();
            }
        } catch (Exception e) {
            e.printStackTrace();
            pool.shutdownNow();
        }
        pool.execute(new TaskC());  //线程池shutdown之后，不再接受新任务， 这个线程不会执行
    }
}

class TaskA implements Runnable {
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

class TaskB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            if (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " bbbbb " + Thread.currentThread().getState() + "  " + Thread.currentThread().isInterrupted());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;  //通过shutdown 触发sleep 线程，获取InterruptedException, 然后在异常处理中return，才能终止这个线程。
                }
            } else {
                return;
            }
        }
    }
}

class TaskC implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            if (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " ccccc " + Thread.currentThread().getState() + "  " + Thread.currentThread().isInterrupted());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
    //通过调用线程的interrupt方法终止线程运行
    // public boolean cancel(boolean mayInterruptIfRunning) { if (!(state == NEW && UNSAFE.compareAndSwapInt(this, stateOffset, NEW, mayInterruptIfRunning ? INTERRUPTING : CANCELLED))) return false; try { // in case call to interrupt throws exception if (mayInterruptIfRunning) { try { Thread t = runner; if (t != null) t.interrupt(); } finally { // final state UNSAFE.putOrderedInt(this, stateOffset, INTERRUPTED); } } } finally { finishCompletion(); } return true; }

}
