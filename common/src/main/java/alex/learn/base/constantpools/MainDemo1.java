package alex.learn.base.constantpools;

/**
 * author  : zhiguang
 * date    : 2018/7/23
 * 了解JVM的常量池机制，类的运行时常量池依赖字符串常量池，后者才是真正的常量池
 */
public class MainDemo1 {
    public static void main(String[] args){
        PersonA a = new PersonA();
        PersonB b = new PersonB();

        System.out.println(a.getStr().hashCode());
        System.out.println(b.getStr().hashCode());

        if(a.getStr() == b.getStr()){
            System.out.println("YY");
        }

        if(a.getStr().equals(b.getStr()) ){
            System.out.println("ZZ");
        }

        String aa = "xxyyy";
        String aa1 = "xxyyy";
        if(aa == aa1){
            System.out.println("YY");//yy
        }
        if(aa.equals(aa1) ){
            System.out.println("ZZ");//ZZ
        }
        String aa2 = new String("xxyyy");
        //==号比较的是引用里面存储的字节数组，而在java中字符串引用持有的是目标字符串的地址
        //创建aa2的时候，实际上创建了两个对象，一个堆内存中的new String("xxyy"), 它创建的时候，
        // 会去查询常量池，发现已经有xxyy，无需创建，直接让自己指向它。
        //而aa2持有的是new String("xxyy")的堆内存地址，所以进行==比较时，无法通过。
        if(aa == aa2){
            System.out.println("YY");//无法输出
        }
        if(aa.equals(aa2) ){
            System.out.println("ZZ");//ZZ
        }


    }
}
