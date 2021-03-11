package alex.learn.threads.springthread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhiguang on 2018/6/18.
 */
@Controller
@RequestMapping("/thread")
public class ThreadController {

    // 日志
    private static final Logger logger = LoggerFactory.getLogger(ThreadController.class);

    @Autowired
    AsynTaskService asynTaskService;

    //    http://localhost:8090/hh/tt/thread/test
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getHome(){
        for(int a=0;a<50;a++){
            this.asynTaskService.method1();
            this.asynTaskService.method2();
        }
        logger.debug("path: /hh/tt/thread/test");
        return "userrtmmmmttt";
    }


    @ResponseBody
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public String getHome2(){
        for(int a=0;a<50;a++){
            this.asynTaskService.method1();
            this.asynTaskService.method2();
        }
        logger.debug("path: /hh/tt/thread/test2");
        return "userrtmmmmttt";
    }

}
