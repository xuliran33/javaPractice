package com.xlr.abs;
// 父类
public abstract class Base {
	public Base() {
		System.out.println("父类无参构造方法");
	}
	
	public static void main(String[] args) {
		Base b = new Sub();
	}
}

class Sub extends Base{
	public Sub() {
		// TODO Auto-generated constructor stub
		System.out.println("子类无参构造方法");
	}
	
	
}
