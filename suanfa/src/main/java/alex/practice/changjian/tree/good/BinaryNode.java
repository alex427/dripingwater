package alex.practice.changjian.tree.good;

import java.io.Serializable;

/**
 * author  : zhiguang
 * date    : 2018/8/20
 */
public class BinaryNode<T extends Comparable> implements Serializable {
    public T data;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(T data, BinaryNode left, BinaryNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

    public BinaryNode(T data){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    //判断是否为叶子节点
    boolean isLeaf(){
        return this.left==null && this.right==null;
    }

    public int compareTo(T t){
        return this.data.compareTo(t);
    }
}
