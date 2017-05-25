/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *  |_ OracleDB
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class OracleDB implements IDBManager{
	public void insert(){
		System.out.println("Oracle DB 저장");
	}
	public void search(){
		System.out.println("Oracle DB 조회");
	}
	public void update(){
		System.out.println("Oracle DB 변경");
	}
	public void delete(){
		System.out.println("Oracle DB 삭제");
	}
}
