package com.mingrisoft;

/**
 * 在类的继承中, 只能做单重继承, 而实现接口时, 一次则可以实现多个接口, 每个接口间使用都好分隔, 这时就可能出现变量或方法名冲突的情况, 解决该问题时, 如果变量冲突, 则需要明确指定变量的接口, 可以实现"接口名.变量"实现, 如果出现方法冲突, 则只要实现一个方法即可
 * */
public class Circel implements ICalculate {
	// 定义计算圆面积的方法
	public float getArea(float r) {
		float area = PI *r *r;
		return area;
	}
	// 定义计算圆周长的方法
	public float getCircumference(float r) {
		float circumference = 2 * PI *r;
		return circumference;
	}

}
