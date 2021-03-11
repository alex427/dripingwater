package alex.learn.spring.springcontext;

import org.springframework.stereotype.Component;

/**
 * author  : zhiguang
 * date    : 2018/7/6
 */
@Component
class C {
    public C() {
        System.out.println("C..init..");
    }
    public void foo(){
        System.out.println("cccc");
    }
}