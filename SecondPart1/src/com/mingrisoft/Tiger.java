package com.mingrisoft;

public class Tiger extends Beast {
	public Tiger() {
		super("条纹");	// 使用父类带参数的构造方法
		super.move();	// 使用父类的成员方法
		super.skin = "条纹";	// 修改父类的成员变量
	}
}
