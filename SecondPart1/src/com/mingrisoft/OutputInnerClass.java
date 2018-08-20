package com.mingrisoft;

/**
 * 内部类的继承
 * 在某各类继承内部类时, 必须硬性给予这个类一个带参数的构造方法, 并且该构造方法的参数为需要继承的外部类的引用, 同时在构造方法中使用a.super()语句, 这样才为继承提供了必要的引用对象
 * */
public class OutputInnerClass extends ClassA.ClassB {	//继承内部类ClassB
	public OutputInnerClass(ClassA a) {
		 a.super();
	}
}

class ClassA{
	class ClassB{}
}
