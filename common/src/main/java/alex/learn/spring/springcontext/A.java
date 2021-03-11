package alex.learn.spring.springcontext;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * author  : zhiguang
 * date    : 2018/7/6
 */
@Repository
public class A {
    /**
     * 属性初始化的顺序是在构造器之前，编译器也会先设置默认值，然后赋予指定值
     * 但是当该类的实例是spring注解的注入方式，那么被指定的值不会被赋值
     */
    public int aa=1;//定义到C的前面，会被先于C初始化
    public String as;//如果该类的对象是springMVC注解注入的方式，那么这个属性默认是null，即使赋值，也是空

    @Resource
    public C c ; //不会被初始化  如果 = new C(); 会先于aa和aaa初始化
    public int aaa=2;//定义到C的后面，但是 C不会被初始化

    public void run(){
        System.out.println("aaaaa");
        c.foo();
    }
}





