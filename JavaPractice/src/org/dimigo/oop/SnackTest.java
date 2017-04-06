/**
 * 
 */
package org.dimigo.oop;

import java.text.Format;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ SnackTest
 *
 * 1. 개요 : 실습과제6 과자배열
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		Snack[] snack = new Snack[]{
				new Snack("세우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4),
		};
		
		for (int i = 0; i < snack.length; i++) {
			sum += snack[i].calcPrice();
			System.out.println(snack[i].toString());
		}
		
		System.out.println("총 구매 금액 : "+String.format("%,d", sum)+"원");
		
		
		
		
	}

}
