/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : KAMAPNA
 * @version : 1.0
 *
 */
public class Car {
	// 클래스 필드 선언
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

	
	
	//클래스 메소드 선언
	//getter 메소드 선언
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public int getPrice(){
		return price;
	}
	
	// setter 메소드 선언
	public void setCompany(String newCompany){
		company = newCompany;
	}
	
	public void setModel(String newModel){
		model = newModel;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
	
}
