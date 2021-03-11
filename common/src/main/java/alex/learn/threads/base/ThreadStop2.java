package alex.learn.threads.base;

public class ThreadStop2 {
    public static void main(String[] args) {
        try {
            Thread t1 = new Threadf();
            t1.start();
            Thread.sleep(10);
            t1.interrupt();

        } catch (InterruptedException e) {
            System.out.println("main catch......");
            e.printStackTrace();
        }

    }
}


class Threadf extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 50000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经停止状态，线程退出");
                    throw new InterruptedException();
                }
                System.out.println("i=" + i);
            }
            System.out.println("for后面的语句"); //没执行
        } catch (InterruptedException e) {
            System.out.println("捕获异常");
            //e.printStackTrace();
        }
    }
}