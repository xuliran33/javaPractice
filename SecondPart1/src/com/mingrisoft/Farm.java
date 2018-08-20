package com.mingrisoft;

public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("调用 Apple 类的 harvest()方法的结果: ");
		Apple apple = new Apple();
		apple.harvest();
		
		System.out.println("调用 Orange 类的 harvest()方法的结果: ");
		Orange orange = new Orange();
		orange.harvest();
	}

}
