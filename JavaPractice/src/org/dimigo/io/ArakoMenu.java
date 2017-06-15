/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *  |_ ArakoMenu
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 15.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class ArakoMenu {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
				BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) {
			String data;
			while((data = br.readLine()) != null){
				writer.write(data+"\n");
			}
			int result;
			writer.flush();
			System.out.println("<< 메뉴 출력 >>");
			String str;
			while ((str = reader.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}