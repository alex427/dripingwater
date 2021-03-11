package alex.learn.threads.springthread;

/**
 * author  : zhiguang
 * date    : 2018/7/9
 */
import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsynTaskServiceImpl implements AsynTaskService{

    // 日志
    private static final Logger logger = LoggerFactory.getLogger(ThreadController.class);

    // 标注为异步任务，在执行此方法的时候，会单独开启线程来执行
    @Async
    public void method1() {
        logger.debug("method1 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    public void method2() {
        logger.debug("method2 : " + Thread.currentThread().getName() + "   " + UUID.randomUUID().toString());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
