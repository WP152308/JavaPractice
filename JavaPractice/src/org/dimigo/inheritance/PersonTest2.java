/**
 * 
 */
package org.dimigo.inheritance;

/**
*  <pre>
* org.dimigo.inheritance
*		|_ PersonTest
*
* 1. 개요 : 
* 2. 작성일 : 2017. 5. 10.
* </pre>
*
 * @author   :  KAMAPNA
 * @version  : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person[] p = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				 new Chinese("왕밍")
		};
		
		for(Person a : p){
			System.out.println(a.toString());
			greeting(a);
			System.out.println();
		}
		

	}
	private static void  greeting(Person p) {
		p.sayHello();
		p.sayBye();
	}

}
