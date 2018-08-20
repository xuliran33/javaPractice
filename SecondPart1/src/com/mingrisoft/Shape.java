package com.mingrisoft;

public abstract class Shape {
	// 创建抽象类
	public String getName() {		// 利用放射机制获得类名(图形名称)
		return this.getClass().getSimpleName();
	}
	
	public abstract double getArea(); // 抽象方法, 获得图形的面积
}
