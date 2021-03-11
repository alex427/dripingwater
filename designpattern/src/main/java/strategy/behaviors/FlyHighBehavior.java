/**
 * 
 */
package strategy.behaviors;


import  strategy.interfaces.Fly;

/**
 * @author zhiguang
 *
 */
public class FlyHighBehavior implements Fly {

	@Override
	public void fly() {
		System.out.println("I can fly high");
		
	}

}
