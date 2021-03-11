package alex.learn.spring.springcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * author  : zhiguang
 * date    : 2018/7/6
 */
@RestController
class AController {

    @Autowired
    AService sService;

    @Autowired
    private ResourceReader reader;


    private static ApplicationContext applicationContext = null;

    @Resource
    public A a = new A();

    @RequestMapping("/t")
    public  void test1() {

        System.out.println(reader);
        sService.work();

        System.out.println(a.as);//如果是注解注入A对象，注意此时A的初始化 只是简单的调用A的空构造函数，A中的属性默认都是默认值（int是0，类属性是null），A中的属性如果自定义了赋值，也不会被使用。
        System.out.println(a.aa);
        //a.c.foo();
        System.out.println(a.c);
        System.out.println(a.aaa);
    }



}
