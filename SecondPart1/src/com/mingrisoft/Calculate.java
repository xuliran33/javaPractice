package com.mingrisoft;

/**
 * 重载方法之间并不一定必须有联系, 但是为了提高程序的可读性, 一般只重载功能相似的方法
 * 在进行方法的重载时, 返回值的类型不能作为区分方法的标志
 * */

public class Calculate {
	final float PI = 3.14159f;		// 定义一个用来表示圆周率的常量PI
	// 求圆形的面积
	public float getArea(float r) {	// 定义一个用于计算面积的方法getArea()
		return PI * r * r;
	}
	
	// 求矩形的面积
	public float getArea(float l, float w) {		// 重载 getArea()方法
		return l * w;
	}
	
	// 画任意形状的图形
	public void draw(int num) {	// 定义一个用于画图的方法 draw()
		System.out.println("画" + num + "个任意形状的图形");
	}
	
	// 画指定形状的图形
	public void draw(String shape) {		// 重载 draw()方法
		System.out.println("画一个" + shape);
	}
	
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		
		float l = 20;
		float w = 30;
		float areaRectangle = calculate.getArea(l, w);
		System.out.println("求长为" + l + "宽为" + w + "的矩形面积是" + areaRectangle);
		
		float r = 7;
		float areaCircle = calculate.getArea(r);
		System.out.println("求半径为" + r + "的圆的面积是: " + areaCircle);
		
		int num = 7;
		calculate.draw(num);
		calculate.draw("三角形");
	}
}
