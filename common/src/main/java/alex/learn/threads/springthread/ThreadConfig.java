package alex.learn.threads.springthread;

/**
 * author  : zhiguang
 * date    : 2018/7/9
 * 采用Java配置的方式使用多线程
 */
import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("alex.learn")
// 启用异步任务
@EnableAsync
public class ThreadConfig  {

    // Executor 就是一个线程池
    @Bean
    public Executor getExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);//核心线程数
        executor.setMaxPoolSize(50);//最大线程数，如果超过，报错RejectedExecutionException，拒绝执行
        executor.setQueueCapacity(25);
        executor.initialize();
        return executor;
    }
}
