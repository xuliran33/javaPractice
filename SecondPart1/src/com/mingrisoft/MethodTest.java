package com.mingrisoft;

import java.lang.reflect.Method;

/**
 * 调用类的方法
 * 静态方法可以直接使用类名调用
 * 非静态方法必须使用类的对象调用
 * 反射机制, 可以根据需要制定调用的方法, 而不必在编程时确定, 调用的方法不仅只限于public, 还可以是private的
 * */
public class MethodTest {
	public static void main(String[] args) {
		try {
			System.out.println("调用Math类的静态方法sin()");
			Method sin = Math.class.getDeclaredMethod("sin", Double.TYPE);
			Double sin1 = (Double)sin.invoke(null, new Integer(1));
			System.out.println("1的正弦值是: " + sin1);
			System.out.println("调用String类的非静态方法 equals()");
			Method equals = String.class.getMethod("equals", Object.class);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
