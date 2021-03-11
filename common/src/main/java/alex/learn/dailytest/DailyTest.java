package alex.learn.dailytest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhiguang on 2018/7/22.
 */
public class DailyTest {

    public static void main(String[] args) {

        //String partitionNum = "0:-1:-1,1:-1:-1,2:-1:-1,3:-1:-1,4:-1:-1,5:-1:-1,6:-1:-1,7:-1:-1,8:-1:-1,9:-1:-1";
        String partitionNum = "0:-1:-1";
        ExecutorService executor;
        if (partitionNum.split("-", -1).length == 2) {
            System.out.println("aa");
            System.out.println(Integer.parseInt(partitionNum.split("-", -1)[1]) - Integer.parseInt(partitionNum.split("-", -1)[0]));
            executor = Executors.newFixedThreadPool(Integer.parseInt(partitionNum.split("-", -1)[1]) - Integer.parseInt(partitionNum.split("-", -1)[0]));//one partition one thread
        } else {
            System.out.println(Integer.parseInt(partitionNum));
            executor = Executors.newFixedThreadPool(Integer.parseInt(partitionNum));
        }

    }
}
