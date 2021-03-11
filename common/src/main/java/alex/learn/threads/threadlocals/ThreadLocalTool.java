package alex.learn.threads.threadlocals;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class ThreadLocalTool {
    public static ThreadLocal<String> local = new ThreadLocal<>();
}

class Main {
    private static volatile int f =0;
    public static void main(String[] args){
     for (int i=0;i<5;i++){
         new Thread(new Runnable() {
             @Override
             public void run() {
                 while (f<200) {
                     ThreadLocalTool.local.set(Thread.currentThread().getName() + " aaaa  " +f);
                     f++;
                     System.out.println(ThreadLocalTool.local.get());
                 }
             }
         },"线程"+i).start();
     }


    }
}