package alex.learn.threads.singleton;

/**
 * Created by zhiguang on 2017/10/16.
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton s;

    //在第二次判断的上加锁，不在方法上加锁
    //防止在第一次check的时候突然失去锁，导致出现问题
    //check -->sync--->check-->new
    public static DoubleCheckSingleton getS()  {
        if(s == null){
            //这里用sleep来表示可能存在的业务过程
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (DoubleCheckSingleton.class){
                if(s == null){
                    s = new DoubleCheckSingleton();
                }
            }
        }
        return s;
    }
}

