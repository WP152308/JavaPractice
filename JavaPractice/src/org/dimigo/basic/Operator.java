/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Operator
 *
 * 1. 개요 : 실습과제2 - 디미베네 연간 인건비 구하기
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author : KAMAPN
 * @version : 1.0
 *
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long money = 1700000;
		long people = 3;
		long store = 1500;
		long yearmoney = money * 12 * people * store;
		System.out.println("<<디미베네 연간 인건비>>");
		
		System.out.println("월 평균 급여 : "+String.format("%,d", money)+"원");
		System.out.println("점포 내 직원 수 : "+people+"명");
		System.out.println("점포 수 : "+String.format("%,d", store)+"개");
		System.out.println("연간 인건비 : "+String.format("%,d", yearmoney)+"원");

	}

}
