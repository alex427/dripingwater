/**
 * 
 */
package observers.test;


import observers.observer.CompanyA;
import observers.observer.CompanyB;
import observers.subject.WeatherStation;

/**
 * @author zhiguang
 *
 */
public class Main {
 
	public static void main(String[] args) {

		CompanyA companyA = new CompanyA();
		CompanyB companyB = new CompanyB();

		WeatherStation station = new WeatherStation();

		station.registObserver(companyA);
		station.registObserver(companyB);
		station.notifyObserver(30, 22, 33);
		
	}

}
