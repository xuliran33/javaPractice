package com.mingrisoft;

/**
 * 与Java 的类文件一样, 接口文件的文件名必须与接口名相同
 * */
// 接口的声明
public interface ICalculate {
	final float PI = 3.15159f;		// 定义用于表示圆周率的常量PI
	float getArea(float r);			// 定义一个用于计算面积的方法getArea()
	float getCircumference(float r);	// 定义一个用于计算周长的方法getCircumference()
}
