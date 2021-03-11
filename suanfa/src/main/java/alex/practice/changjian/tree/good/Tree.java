package alex.practice.changjian.tree.good;

/**
 * author  : zhiguang
 * date    : 2018/8/20
 */
public interface Tree<T extends Comparable> {

    //是否为空树？
    boolean isEmpty();
    //高度
    int getHeight();
    //节点个数
    int getSize();

    //前序遍历
    String preoder();
    //中序遍历
    String inoder();
    //后序遍历
    String postorder();
    //层次遍历
    String levelorder();

    //插入
    void insert(T data);
    //删除
    void remove(T data);

    //根据值：查找节点
    BinaryNode findNode(T data);
    //根据值：是否包含某个节点
    boolean contains(T data);
    //根据值：查找最大值
    T findMax();
    //根据值：查找最小值
    T findMin();

    //清空
    void clear();
}
