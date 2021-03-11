package alex.practice.xiaojiayu.linear.linkedlistt.single;

/**
 * Created by zhiguang on 2018/7/1.
 */
public class MainDrive {

    public static void main(String[] args){
        Node node5 = new Node(5,null);
        Node node4 = new Node(4,node5);
        Node node3 = new Node(3,node4);
        Node node2 = new Node(2,node3);
        Node node1 = new Node(1,node2);
        Node head = new Node(0,node1);
        SingleLinkedList ll = new SingleLinkedList();
        ll.addHead(node5);
        ll.addHead(node4);
        ll.addHead(node3);
        ll.addHead(node2);
        ll.addHead(node1);
        ll.addHead(head);

        while(ll.hasNext()){
            System.out.println(ll.next());
        }
    }
}
