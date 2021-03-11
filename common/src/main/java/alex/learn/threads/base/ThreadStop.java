package alex.learn.threads.base;


//如何停止线程
public class ThreadStop {

    public static void main(String[] args){
        Thread t = new Mythreada();
        //t.start();
        t.interrupt();
        //这种方式根本无法停止， 源码里面说的很清楚Just to set the interrupt flag
        //只是给线程设置一个标签
        //必须由isInterrupted状态进行判断，通过return， break 或者抛异常来进行停止。
        //换言之， 线程停止，用的是java自身的操作

        Thread t2 = new Mythreadb();
        //t2.start();
        try {
            t2.sleep(10);
            //Thread.sleep(10); 无论是main线程sleep，还是t2线程sleep，都行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt();


        Thread t3 = new Mythreadc();
        //t3.start();
        t3.interrupt();


        Thread t4 = new Mythreadd();
        t4.start();
        try {
            //t4.sleep(10);
            Thread.sleep(10); //无论是main线程sleep，还是t2线程sleep，都行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t4.interrupt();


        Thread t5 = new Mythreade();
        t5.start();
        try {
            //t5.sleep(10);
            Thread.sleep(10); //无论是main线程sleep，还是t2线程sleep，都行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t5.interrupt();




    }
}

class Mythreada extends Thread {
    @Override
    public void run(){
        for (int i=0;i<5000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
        System.out.println("这是for循环外面的语句，也会被执行");
    }
}

class Mythreadb extends Thread {
    @Override
    public void run(){
        for (int i=0;i<5000;i++){
            //这两种方法都能判断线程interrputed，isInterrupted是基础方法， interrupted调用该方法
            //但是interrputed除了判断状态，还会清除这个状态，如果两次调用，第二次就是false, 谨慎。所以还是用isInterrupted为好。
            //if(this.isInterrupted()){
            if(this.interrupted()){
                System.out.println("you are interrupted .... ");
              return;
            }
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
        System.out.println("这是for循环外面的语句，也会被执行"); //但是for循环外面的语句会执行，换言之，run方法会执行完成
    }
}

class Mythreadc extends Thread {
    @Override
    public void run(){
        for (int i=0;i<5000;i++){
            try {
                Thread.sleep(100); //如果在run方法内部sleep，线程无法interrupt，原因没搞明白
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(this.isInterrupted()){
                System.out.println("you are interrupted .... ");
                return;
            }
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
        System.out.println("这是for循环外面的语句，也会被执行");
    }
}

class Mythreadd extends Thread {
    @Override
    public void run(){
        for (int i=0;i<5000;i++){
            //if(this.isInterrupted()){
            if(this.interrupted()){
                System.out.println("you are interrupted .... ");
                break;  //break方法可行
            }
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }

        System.out.println("这是for循环外面的语句，也会被执行");
    }
}

class Mythreade extends Thread {
    @Override
    public void run(){
        for (int i=0;i<5000;i++){
            //if(this.isInterrupted()){
            if(this.interrupted()){
                System.out.println("you are interrupted .... ");
                break;
            }
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
        System.out.println("这是for循环外面的语句，也会被执行");
    }
}