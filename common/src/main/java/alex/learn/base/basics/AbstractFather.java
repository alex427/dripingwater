package alex.learn.base.basics;

public abstract class AbstractFather {

    public void methodA(){
        System.out.println("已经实现");
    }

    public abstract void methodB();

}


abstract class Sonn extends AbstractFather{
    //抽象子类可以把抽象父类中的实体方法覆盖，并标记为抽象方法。。。
    //装饰者模式中的那个抽象装饰父类，就是这样玩的
    public abstract void methodA();
}
