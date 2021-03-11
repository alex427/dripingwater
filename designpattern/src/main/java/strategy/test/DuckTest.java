package strategy.test;


import strategy.behaviors.FlyHighBehavior;
import strategy.behaviors.FlyLowBehavior;
import strategy.behaviors.SpeakBadBehavior;
import strategy.behaviors.SpeakGoodBehavior;
import strategy.child.GreenDuck;
import strategy.child.RedDuck;
import strategy.interfaces.Fly;
import strategy.interfaces.Speak;

/**
 * @author zhiguang
 */
public class DuckTest {

    public static void main(String[] args) {

        Fly fh = new FlyHighBehavior();
        Fly fl = new FlyLowBehavior();
        Speak sb = new SpeakBadBehavior();
        Speak sg = new SpeakGoodBehavior();

        GreenDuck greenDuck = new GreenDuck(fh, sb);
        RedDuck redDuck = new RedDuck(fl, sg);

        greenDuck.fly();
        greenDuck.speak();
        greenDuck.dosome();

        redDuck.fly();
        redDuck.speak();
        redDuck.dosome();

    }

}
