package com.mingrisoft;

public class TransferProperty {
	int i = 47;
	static int j = 100;
	public void call() {
		System.out.println("调用 call()方法");
		for (int i = 0; i < 3; i++) {
			System.out.println(i+ "");
			if (i == 2) {
				System.out.println("\n");
				}
			}
	}
	
	public TransferProperty() {
		
	}
	
	public static void main(String[] args) {
		TransferProperty t1 = new TransferProperty();	// 创建一个对象
		TransferProperty t2 = new TransferProperty();	// 创建另一个对象
		t2.i = 60;			// 将成员变量赋值为60
//		t2.j = 30;
		// 使用第一个对象调用类成员变量
		System.out.println("第一个实例对象调用成员变量i的结果是: " + t1.i++);
//		System.out.println("第一个实例对象调用成员变量j的结果是: " + t1.j++);
		t1.call();		// 使用第一个对象调用类成员方法
		// 使用第二个类调用类成员变量
		System.out.println("第二个实例对象调用变量i的结果: " + t2.i);
//		System.out.println("第一个实例对象调用成员变量i的结果是: " + t2.j++);
		t2.call();  		// 使用第二个对象调用类成员方法

	}
}
