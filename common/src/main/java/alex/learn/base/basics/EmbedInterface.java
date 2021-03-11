package alex.learn.base.basics;

/**
 * author  : zhiguang
 * date    : 2018/7/3
 */
public interface EmbedInterface {

    String name = "name"; //等同常量

    void methoda();

    interface Innerterface {
        void methodb();
    }

}
