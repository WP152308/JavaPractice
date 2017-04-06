/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Snack
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;

	public Snack() {

	}

	public Snack(String name, String company, int price, int number) {
		this.company = company;
		this.name = name;
		this.price = price;
		this.number = number;
	}

	public int calcPrice() {
		return this.price * this.number;
	}

	public String toString() {
		return "이름 : " + name + "\n" + "제조사 : " + company + "\n" + "가격 : " + String.format("%,d", price) + "\n개수 : "
				+ number + "\n";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

}
