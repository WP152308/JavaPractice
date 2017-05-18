/**
 * 
 */
package org.dimigo.abstractclass;

/**
*  <pre>
* org.dimigo.inheritance
*		|_ SmartPhoneTest
*
* 1. 개요 : 
* 2. 작성일 : 2017. 5. 17.
* </pre>
*
 * @author   :  KAMAPNA
 * @version  : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] p ={
				new IPhone("iPhone7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone p2 : p){
			System.out.println(p2.toString());
			p2.turnOn();
			p2.pay();
			p2.useSpecialFunction();
			p2.turnOff();
			System.out.println();
		};
		
	}

}
