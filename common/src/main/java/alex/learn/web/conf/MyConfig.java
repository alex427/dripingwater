package alex.learn.web.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author  : zhiguang
 * date    : 2018/7/27
 */
@Configuration
public class MyConfig {

    @Bean
    public TriangleShape getTriangleShape(){
        return new TriangleShape();
    }
}
