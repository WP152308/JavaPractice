/**
 * 
 */
package org.dimigo.interfaces;import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * <pre>
 * org.dimigo.interfaces
 *  |_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public interface IDBManager {
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database){
		if(database.equals(ORACLE_DATABASE)){
			return new OracleDB();
		}
		else if(database.equals(SYBASE_DATABASE)){
			return new SybaseDB();
		}
		return null;
	}
	


}
