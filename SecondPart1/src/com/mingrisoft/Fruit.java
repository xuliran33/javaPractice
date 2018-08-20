package com.mingrisoft;

public abstract class Fruit {	// 定义抽象类
	// 抽象类
	public String color;		// 定义颜色成员变量
	// 定义构造方法
	public Fruit() {
		color = "绿色";		// 对变量进行初始化
	}
	
	// 在抽象类中创建的, 没有实际意义的, 必须要子类重写的方法称为抽象方法, 抽象方法只有声明, 没有实现
	// 抽象方法不能用static和public关键字进行修饰
	// 包含一个或多个抽象方法的类必须被声明为抽象类
	public abstract void harvest();	// 收获的方法

}
