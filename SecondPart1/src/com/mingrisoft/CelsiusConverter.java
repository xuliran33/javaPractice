package com.mingrisoft;

import java.util.Scanner;

public class CelsiusConverter {
	// 将摄氏温度转换成华氏温度
	public double getFahrenheit(double celsius) {
		double fahrenheit = 1.8 * celsius + 32;
		return fahrenheit;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入要转换的温度 (单位: 摄氏度)");
		Scanner in = new Scanner(System.in);
		double celsius = in.nextDouble();
		CelsiusConverter convert = new CelsiusConverter();
		double fahrenheit = convert.getFahrenheit(celsius);
		System.out.println("转换完成的温度 (单位: 华氏度) : " + fahrenheit);
	}
}
