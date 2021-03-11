/**
 * 
 */
package observers.observer;


import  observers.interfaces.Observer;

/**
 * @author zhiguang
 *
 */
public class CompanyB implements Observer {

	public CompanyB() {
		
	}	
	
	@Override
	public void updateData(Integer temprature, Integer humidity, Integer pressure) {
		 System.out.println("CompanyB气象数据如下: "+temprature +"----"+humidity+"---"+pressure);		
	}

}
