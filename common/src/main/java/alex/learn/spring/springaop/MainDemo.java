package alex.learn.spring.springaop;

/**
 * author  : zhiguang
 * date    : 2018/7/24
 */
public class MainDemo {

    public static void main(String[] args){
       /* SecurityDog dog = new SecurityDog();
        JDKProxyWorker proxy = new JDKProxyWorker();
        QuanKe p = (QuanKe)proxy.bind(dog);
        p.bark();*/

        WildDog wildDog = new WildDog();
        QuanKe p2 = (QuanKe)Worker.getProxy(wildDog);
        p2.bark();

    }
}
