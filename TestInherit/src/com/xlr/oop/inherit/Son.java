package com.xlr.oop.inherit;
// 一个文件里面只能有一个公共的类
/**
 * 方法重写的规则
 * 方法名相同
 * 参数列表相同
 * 返回值相同或者是其子类
 * 访问权限不能严于父类
 * 父类的静态方法不能被子类覆盖为非静态方法, 父类的非静态方法不能被子类覆盖为静态方法
 * 子类可以定义与父类同名的静态方法, 以便在子类中隐藏父类的静态方法(注:静态方法中无法使用super)
 * 父类的私有方法不能被子类覆盖
 * 不能抛出比父类方法更多的异常
 * */
class Father{
	String name = "father";
	public void m1() {
		System.out.println("father类的m1方法");
	}
}
public class Son extends Father {
	String name = "son";

	public void m1() {
		System.out.println("son类的m1方法");
	}
	
	public void varTest() {
		System.out.println(name);
		System.out.println(super.name);
		super.m1();
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		son.varTest();
		son.m1();
	}
}
