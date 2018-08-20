package com.mingrisoft;

/**
 * 静态内部类
 * 在内部类前添加修饰符static, 这个内部类就变为静态内部类
 * 一个静态内部类中可以声明static成员, 但在非静态内部类中不可以声明静态成员
 * 不可以使用外部类的非静态成员
 * 创建静态内部类的对象, 不需要其外部类的对象
 * 不能从静态内部类的对象中访问非静态外部类的对象
 * */

public class StaticInnerClass {
	static int x = 100;
	static class Inner{
		static void doitInner() {
			System.out.println("外部类的成员变量" + x);// 调用外部类的成员变量
			// 在静态内部类中定义主方法,并访问内部类中的方法
		}
		
		public static void main(String args[]) {
			doitInner();
		}
	}
}
