package alex.practice.changjian.digui;

import java.math.BigInteger;

public class JieCheng3 {

	/**
	 *  求出1000的阶乘所有零和尾部零的个数,不用递归做
	 */
	public static void main(String[] args) throws InterruptedException {
		demo2();
	}

	public static void demo2() throws InterruptedException {
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);	//将bi1与bi2相乘的结果赋值给bi1
		}
		String str = bi1.toString();	//获取字符串表现形式
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();

		int count = 0;					//定义计数器
		for(int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			}else {
				count++;
			}
		}
		
		System.out.println(count);
	}

	public static void demo1() {		//求1000的阶乘中所有的零
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+"");
			bi1 = bi1.multiply(bi2);	//将bi1与bi2相乘的结果赋值给bi1
		}
		String str = bi1.toString();	//获取字符串表现形式
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if('0' == str.charAt(i)) {	//如果字符串中出现了0字符
				count++;				//计数器加1
			}
		}
		System.out.println(count);
	}

}
