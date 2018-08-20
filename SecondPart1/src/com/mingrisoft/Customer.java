package com.mingrisoft;

public class Customer {
	public static void main(String[] args) {
		System.out.println("顾客要购买 BMW: ");
		Car1 bmw = CarFactory.getCar("BMW");
		System.out.println("提取汽车: " + bmw.getInfo());
		
		System.out.println("顾客要购买 Benz: ");
		Car1 benz = CarFactory.getCar("Benz");
		System.out.println("提取汽车: " + benz.getInfo());
	}
}
