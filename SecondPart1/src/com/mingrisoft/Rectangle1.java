package com.mingrisoft;

public class Rectangle1 extends Shape{

	private double length;
	private double width;
	
	public Rectangle1(double length, double width) {		// 获取矩形的长和宽
		this.length = length;
		this.width = width;
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
