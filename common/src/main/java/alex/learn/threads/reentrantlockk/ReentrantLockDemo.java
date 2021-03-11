package alex.learn.threads.reentrantlockk;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

/**
 * author  : zhiguang
 * date    : 2018/8/8
 * 互斥锁比notify能更好的控制线程
 * 三个因子: 互斥锁, 条件对象, 条件标签
 *多线程中的异常无法被抛到main上面
 */
public class ReentrantLockDemo {
        public static void main(String[] args){
            final Printer p = new Printer(); //为什么最好加上final？
            new Thread(){
                public void run(){
                    try {
                        while(true){
                            p.print1();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

            new Thread(){
                public void run(){
                    try {
                        while (true){
                            p.print2();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();

            new Thread(){
                public void run(){
                    try {
                        while(true){
                            p.print3();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    //定义业务类
    class Printer{
        //锁对象
        private ReentrantLock r = new ReentrantLock();
        //条件对象
        private Condition c1 = r.newCondition();
        private Condition c2 = r.newCondition();
        private Condition c3 = r.newCondition();
        //条件标签
        private  int flag = 1;
        public void print1() throws InterruptedException {
            r.lock();
            if(flag !=1){
                c1.await();
            } else {
                System.out.print("这");
                System.out.print("是");
                System.out.print("互斥");
                System.out.println("锁");
                //唤醒条件2
                flag = 2;
                c2.signal();
                r.unlock();
            }
        }
        public void print2() throws InterruptedException {
            r.lock();
            if(flag !=2){
                c2.await();
            } else {
                System.out.print("this ");
                System.out.print("is ");
                System.out.print("a ");
                System.out.println("lock");
                //唤醒条件3
                flag = 3;
                c3.signal();
                r.unlock();
            }
        }
        public void print3() throws InterruptedException {
            r.lock();
            if(flag != 3){
                c3.await();
            }else {
                System.out.print("a ");
                System.out.print("lock ");
                System.out.print("after ");
                System.out.println("jdk1.5");
                System.out.println("  ");
                //唤醒条件1
                flag = 1;
                c1.signal();
                r.unlock();
            }
        }
    }
