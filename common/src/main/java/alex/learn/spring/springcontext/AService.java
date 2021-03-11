package alex.learn.spring.springcontext;

import org.springframework.stereotype.Service;

/**
 * author  : zhiguang
 * date    : 2018/7/6
 */
@Service
public class AService {

    public void work(){
        S s = new S();
        System.out.println( s.a );
        System.out.println( s.getFromIoc() );
        System.out.println("serve you");
    }
}
