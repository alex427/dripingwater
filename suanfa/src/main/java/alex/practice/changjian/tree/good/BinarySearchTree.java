package alex.practice.changjian.tree.good;

/**
 * author  : zhiguang
 * date    : 2018/8/20
 */
public class BinarySearchTree<T extends Comparable> implements Tree<T> {

    //根结点
    public BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return null==root;
    }

    @Override
    public int getHeight() {
        return getHeight(root);
    }

    public int getHeight(BinaryNode root) {
        int l,r;
        if(null==root){
            return 0;
        } else {
            l=getHeight(root.left);
            l++;
            r=getHeight(root.right);
            r++;
            return l>r?l:r;
        }
    }
    @Override
    public int getSize() {
        return getSize(root);
    }

    private int getSize(BinaryNode root) {
        if(null==root){
            return 0;
        } else {
            return getSize(root.left)+1+getSize(root.right);
        }
    }

    @Override
    public String preoder() {
        StringBuffer sb = new StringBuffer();
        String r = preoder(root, sb);
        return r.substring(0,r.length()-3);
    }

    private String preoder(BinaryNode root, StringBuffer sb) {
        sb.append(root.data).append("---");
        if (null != root.left) {
            preoder(root.left,sb);
        }
        if (null != root.right) {
            preoder(root.right,sb);
        }
        return sb.toString();
    }

    @Override
    public String inoder() {
        StringBuffer sb = new StringBuffer();
        String r = inoder(root,sb);
        return r.substring(0,r.length()-3);
    }

    private String inoder(BinaryNode root, StringBuffer sb) {
        if(null != root.left){
            inoder(root.left,sb);
        }
        sb.append(root.data).append("---");
        if(null != root.right){
            inoder(root.right,sb);
        }
        return sb.toString();
    }

    @Override
    public String postorder() {
        StringBuffer sb = new StringBuffer();
        String r = postorder(root,sb);
        return r.substring(0,r.length()-3);
    }

    private String postorder(BinaryNode root, StringBuffer sb) {
        if(null != root.left){
            postorder(root.left,sb);
        }
        if(null != root.right){
            postorder(root.right,sb);
        }
        sb.append(root.data).append("---");
        return sb.toString();
    }

    @Override
    public String levelorder() {
        return null;
    }

    @Override
    public void insert(T data) {
        if (null == data) {
            throw new RuntimeException("no data");
        } else {
            this.root = insert(data, this.root);
        }
    }

    private BinaryNode insert(T data, BinaryNode p) {
        if (null == p) {
            p = new BinaryNode(data, null, null);
        }
        int res = data.compareTo(p.data);
        if (res < 0) {
            p.left = insert(data, p.left);
        } else if (res > 0) {
            p.right = insert(data, p.right);
        } else {
            //重复插入相同元素,不做任何操作
        }
        return p;
    }

    @Override
    public void remove(T data) {

    }

    @Override
    public BinaryNode findNode(T data) {
        return findNode(data,root);
    }

    private BinaryNode findNode(T data, BinaryNode root) {

        return null;
    }

    @Override
    public boolean contains(T data) {
        return contains(data,root);
    }

    private boolean contains(T data, BinaryNode p) {
        if(null==data){
            return false;
        }
        int res = data.compareTo(p.data);
        if(res<0){
            return contains(data,p.left);
        }else if (res<0){
            return contains(data,p.right);
        } else {
            return true;
        }
    }

    @Override
    public T findMax() {
        return null;
    }

    @Override
    public T findMin() {
        return null;
    }

    @Override
    public void clear() {

    }

}
