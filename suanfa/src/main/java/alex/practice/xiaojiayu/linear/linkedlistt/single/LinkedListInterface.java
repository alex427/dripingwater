package alex.practice.xiaojiayu.linear.linkedlistt.single;

import java.util.Iterator;

/**
 * Created by zhiguang on 2018/7/1.
 */
public interface LinkedListInterface<T> {

    void addnew(T node);
    void delete(T node);
    void addHead(T head);
    void addRear(T rear);
    Node getNode(T node);
    boolean hasNext();
    Object next();
}
