package com.mingrisoft;

// 单例
public class Emperor {	
	private static Emperor emperor = null;	// 声明一个Emperor类的引用
	private Emperor() {		// 将构造方法私有
		
	}
	
	public static Emperor getInstance() {	// 实例化引用
		if (emperor == null) {
			emperor = new Emperor();
		}
		return emperor;
	}
	
	public void getName() {
		System.out.println("徐丽然");
	}
}
