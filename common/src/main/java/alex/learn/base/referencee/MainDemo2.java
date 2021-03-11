package alex.learn.base.referencee;

/**
 * author  : zhiguang
 * date    : 2018/7/23
 * 栈里面的引用持有的对象地址，会不会发生变化呢？？
 */
public class MainDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Dog dog =  new Dog("dahua","zhiguang");
        Dog dog2 =  new Dog("dahua","zhiguang");
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());

        Thread.sleep(1000);

        dog=null;

        System.gc();

        Thread.sleep(2000);

        //System.out.println(dog2.hashCode());
        //System.out.println(dog.hashCode());



    }
}
