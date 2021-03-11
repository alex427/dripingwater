package alex.learn.threads.singleton;

/**
 * Created by zhiguang on 2017/10/16.
 */
public class Demo2Drive {
    public static void main(String[] args){
        new Thread(new Runnable() {
            public void run() {
                System.out.println(DoubleCheckSingleton.getS());;
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println(DoubleCheckSingleton.getS());;
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println(DoubleCheckSingleton.getS());;
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println(DoubleCheckSingleton.getS());;
            }
        }).start();
    }
}
