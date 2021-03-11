package alex.learn.spring.config.conditions.demo2;

/**
 * Created by zhiguang on 2018/6/18.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
