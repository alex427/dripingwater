package alex.learn.spring.config.conditions.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhiguang on 2018/6/18.
 */
@Configuration
public class MyConfiguration {

    //错误用法
    //Condition注解用于根据条件引导IOC容器生成对应的Service Bean
    //这种条件往往属于环境条件,在spring容器启动之前就已经确定, 比如操作系统的类型, 比如字符集等等
    //这种条件, 不能是运行时形成的条件
    @Bean
    @Conditional(DataSourceCondition.class)
    public Person getPerson(){
        System.out.println("获得判断结果, 生成目标bean ....");
        return new Person("jack");
    }
}
