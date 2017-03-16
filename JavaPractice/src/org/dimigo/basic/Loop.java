/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *  |_ Loop
 *
 * 1. 개요 : 실습과제3 - 게임 제작.
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		int att = 100;
		String[] ch = {"마법사", "영주", "기사", "농민"};
		do{
			Scanner scanner = new Scanner(System.in);
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------");
			System.out.printf("메뉴 입력 => ");
			num = scanner.nextInt();
			
			switch(num){
			case 1:
				att = att+10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+att);
				break;
			case 2:
				att = att-10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+att);
				break;
			case 3:
				int ran = new Random().nextInt(4) + 1;
				System.out.println(ch[ran]+"(으)로 설정되었습니다.");
				break;
			case 9:
				scanner.close();
				System.out.println("이제 공부하세요!");
				break;
			default:
				System.out.println("없는 메뉴 입니다!!");
			}
		}while(num != 9);
	}

}
