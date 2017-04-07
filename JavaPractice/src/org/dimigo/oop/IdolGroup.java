/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ IdolGroup
 *
 * 1. 개요 : 실습7 - 아이돌 그룹 배열	
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		String[][] memberName = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		for (int i = 0; i < memberName.length; i++) {
			System.out.println("<<"+groupName[i]+">>");
			for (int j = 0; j < memberName[i].length; j++) {
				System.out.println(memberName[i][j]);	
				}
			System.out.println();
		}
	}
}
