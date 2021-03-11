package alex.practice.xiaojiayu.linear.linkedlistt.single;

import java.util.Iterator;

/**
 * Created by zhiguang on 2018/7/1.
 */
public class SingleLinkedList implements LinkedListInterface<Node> {

    private Node head;
    private Node tmp;
    private int size;
    private int position;




    @Override
    public void addnew(Node newnode) {
        //问题：在链表中添加新元素， 这个操作的本质是什么？
        //如果是正序插入，每次在末尾
        //获取最后一个元素， 然后增加， 但这是一个单链表， 所以并不支持这个功能。
        //单链表中的添加元素，就是addHead, 或者是addRear
    }

    //头部插入
    @Override
    public void addHead(Node newhead) {
        newhead.setNext(this.head);
        this.head = newhead;
        this.size++;
    }

    //尾部插入
    @Override
    public void addRear(Node rear) {
        if(null==this.head){
            this.head=rear;
        }else {
            while(null != this.next()){

            }

           // this.head.setNext(rear);
        }
    }

    @Override
    public boolean hasNext() {
        return this.position>this.size?false:true;
    }


    @Override
    public Object next() {
        if(this.position==0){
            this.tmp=this.getHead();
        }else {
            this.tmp=tmp.getNext();
        }
        this.position++;
        return null==this.tmp? null:this.tmp.getElement();
    }


    @Override
    public Node getNode(Node node) {


        return null;
    }


    @Override
    public void delete(Node node) {

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


class Node {
    private Object element; //值域
    private Node next;//后续节点

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + element +
                ", next=" + next +
                '}';
    }
}