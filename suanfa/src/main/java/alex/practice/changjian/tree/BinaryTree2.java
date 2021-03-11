package alex.practice.changjian.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhiguang on 2018/5/2.
 */
public class BinaryTree2 {

    private static BinNode root;

    public static void main(String[] args) {
        List<String> list = initlist();
        BinNode root = createTree(list, 0);
        preOrder(root);
        //inOrder(root);
        //postOrder(root);

    }

    //以前序遍历的方式创建树
    public static BinNode createTree(List<String> list, int index){
        BinNode node = null;
        if(index < list.size()) {
            node = new BinNode(list.get(index));
            node.lChild = createTree(list, index * 2 + 1);
            node.rChild = createTree(list, index * 2 + 2);
        }
        return node;
    }


    public static List<String> initlist(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        list.add("15");
        return list;
    }


    public static void visitdata(BinNode node) {
        if (null != node.element) {
            System.out.print("输出"+node.element+"  " );
        }
    }

    public static void preOrder(BinNode node) {
        System.out.println(node + "  压栈");

        //访问节点值域
        visitdata(node);
        if (node.lChild != null) {
            preOrder(node.lChild);
        }
        if (node.rChild != null) {
            preOrder(node.rChild);
        }

        System.out.println(node + "  出栈");
    }


    public static void inOrder(BinNode node) {
        System.out.println(node + "  压栈");
        if (node.lChild != null) {
            inOrder(node.lChild);
        }
        visitdata(node);
        if (node.rChild != null) {
            inOrder(node.rChild);
        }
        System.out.println(node + "  出栈");
    }


    public static void postOrder(BinNode node) {
        System.out.println(node + "  压栈");
        if (node.lChild != null) {
            postOrder(node.lChild);
        }
        if (node.rChild != null) {
            postOrder(node.rChild);
        }
        visitdata(node);
        System.out.println(node + "  出栈");
    }

}

// 节点类
class BinNode {
    public Object element;
    public BinNode lChild;
    public BinNode rChild;

    public BinNode(Object element) {
        this.element = element;
    }

    public BinNode(Object element, BinNode lChild, BinNode rChild) {
        this.element = element;
        this.lChild = lChild;
        this.rChild = rChild;
    }

    @Override
    public String toString() {
        return this.element.toString();
    }
}
