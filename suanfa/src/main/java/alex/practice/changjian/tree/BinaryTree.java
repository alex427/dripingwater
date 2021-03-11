package alex.practice.changjian.tree;

/**
 * Created by zhiguang on 2018/5/2.
 */
public class BinaryTree {

    private static BinNode root;

    // 节点类--静态内部类
    private static class BinNode {
        private Object element;
        private BinNode lChild;
        private BinNode rChild;

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

    public static void main(String[] args) {
        init();
        //preOrder(root);
        //inOrder(root);
        postOrder(root);

    }

    // 树的初始化:先从叶节点开始,由叶到根
    public static void init() {
        BinNode d = new BinNode("d", null, null);
        BinNode e = new BinNode("e", null, null);
        BinNode g = new BinNode("g", null, null);
        BinNode h = new BinNode("h", null, null);
        BinNode k = new BinNode("k", null, null);
        BinNode l = new BinNode("l", null, null);
        BinNode n = new BinNode("n", null, null);
        BinNode o = new BinNode("o", null, null);


        BinNode c = new BinNode("c", d, e);
        BinNode f = new BinNode("f", g, h);
        BinNode j = new BinNode("j", k, l);
        BinNode m = new BinNode("m", n, o);

        BinNode b = new BinNode("b", c, f);
        BinNode i = new BinNode("i", j, m);

        root = new BinNode("a", b, i);
    }


    public static void visitdata(BinNode node) {
        if (null != node.element) {
            System.out.print("输出"+node.element+"  ");
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
