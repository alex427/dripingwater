package alex.practice.changjian.tree.good;

/**
 * author  : zhiguang
 * date    : 2018/8/21
 */
public class MainDemo {
    public static void main(String[] args){
        BinarySearchTree<Integer> tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(8);
        tree.insert(3);
        tree.insert(6);
        tree.insert(4);
        tree.insert(9);
        tree.insert(2);
        String s1 = tree.preoder();
        String s2 = tree.inoder();
        String s3 = tree.postorder();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(tree.isEmpty());
        System.out.println(tree.getHeight());
        System.out.println(tree.getSize());
        System.out.println(tree.contains(2));
    }
}
