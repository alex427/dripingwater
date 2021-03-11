package alex.learn.spring.config.conditions.demo1;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by zhiguang on 2018/6/18.
 */
public class DataSourceCondition implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println("开始判断当前条件.....");
        return true;
    }
}
