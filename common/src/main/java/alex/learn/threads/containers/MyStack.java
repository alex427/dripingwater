package alex.learn.threads.containers;

import java.util.LinkedList;

/**
 * author  : zhiguang
 * date    : 2018/8/8
 * 线程安全的栈
 */
public class MyStack<T> {

    //采用链表作为基础容器
    private LinkedList list = new LinkedList();

    //设置栈顶
    private volatile Integer max = 15;

    //当前容量
    private volatile Integer size = 0;

    //安全的压栈
    public synchronized void push(T t){
        if( ! (this.size()<15) ){
            throw new RuntimeException("full stack");
        }
        this.list.addFirst(t);
        this.size++;
    }

    //安全弹栈
    public synchronized T pop(){
        T t = (T)this.list.removeFirst();
        this.size--;
        return t;
    }

    public Integer size(){
        return this.size;
    }
}
