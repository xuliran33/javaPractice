package com.mingrisoft;

/**
 * 局部内部类
 * 在类的方法中定义的内部类, 作用范围在这个方法体内
 * */
public class SellOutClass {
	private String name;		// 私有成员变量
	public SellOutClass() {	// 构造方法
		name = "苹果";
	}
	
	public void sell(int price) {	// 局部内部类
		class Apple{
			int innerPrice = price;
			public Apple(int price) {	// 构造方法
				innerPrice = price;
			}
			
			public void price() {	// 方法
				System.out.println("现在开始销售" + name);
				System.out.println("单价为: " + innerPrice + "元");
			}
		}
		
		Apple apple = new Apple(price);	// 实例化Apple类的对象
		apple.price(); 					// 调用局部内部类的方法
	}
	
	public static void main(String[] args) {
		SellOutClass sample = new SellOutClass();	// 实例化SellOutClass类的对象
		sample.sell(100);	// 调用SellOutClass类的sell()方法
	}
}
