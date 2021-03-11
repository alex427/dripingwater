package alex.learn.base.basics;

/**
 * author  : zhiguang
 * date    : 2018/7/3
 */
public class PersonA implements EmbedInterface, EmbedInterface.Innerterface{

    @Override
    public void methoda() {
        System.out.println("aaa");
    }

    @Override
    public void methodb() {
        System.out.println("bbbb");
    }
}