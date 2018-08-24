package com.xlr.goods;

public class Test {
	public static void main(String[] args) {
		Goods goods = Factory.getGood("TV");
		goods.printPrice();
	}
	
	// 绑定机制: 动态绑定, 静态绑定
	// 实例方法(动态绑定机制) 与引用变量实际引用的对象绑定, 调用重写后的方法, 由运行时的jvm(java虚拟机)决定
	// 静态方法(静态绑定机制) 与引用变量所声明的类型绑定, 实际上在编译阶段进行了绑定
	// 成员变量: (静态变量和实例变量) 与引用变量所说明的类型绑定, 属于静态绑定
}
