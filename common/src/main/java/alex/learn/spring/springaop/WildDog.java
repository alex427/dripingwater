package alex.learn.spring.springaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author  : zhiguang
 * date    : 2018/7/24
 */
public class WildDog implements QuanKe{
    @Override
    public void bark() {
        System.out.println("hot barking .... ");
    }



}

class Worker {

    public static QuanKe getProxy( WildDog dog){
        QuanKe proxy = (QuanKe) Proxy.newProxyInstance(dog.getClass().getClassLoader(), dog.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                //代理帮你办点事
                if("save".equals(method.getName())){
                    System.out.println("即将执行持久化，校验数据，校验锁");
                }
                return method.invoke(proxy, args);
            }
        });
        return proxy;
    }
}