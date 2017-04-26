/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person s = new Person("Tom");
		System.out.println(s);

		Korean k = new Korean("홍길동");
		System.out.println(k);

		Japanese j = new Japanese("다나카");
		System.out.println(j);

		Chinese c = new Chinese("왕밍");
		System.out.println(c);

		System.out.println();
		
		s.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();

		System.out.println();

		s.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();

		System.out.println();
	}

}
