package alex.learn.web.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * author  : zhiguang
 * date    : 2018/7/27
 */
@SpringBootConfiguration
public class MyConfig2 {

    @Bean
    public Point getPoint(){
        return new Point();
    }
}
