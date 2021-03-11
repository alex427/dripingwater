/**
 * 
 */
package strategy.child;


import  strategy.foo.Duck;
import strategy.interfaces.Fly;
import strategy.interfaces.Speak;

/**
 * @author zhiguang
 *
 */
public class GreenDuck extends Duck {

    public GreenDuck(Fly fly, Speak speak) {
        this.fly = fly;
        this.speak = speak;
    }

}
