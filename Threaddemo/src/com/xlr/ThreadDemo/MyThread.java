package com.xlr.ThreadDemo;
/**
 * 继承Thread类的方式创建线程
 * 重写run()方法, 编写线程执行体
 * 创建线程对象, 调用start()方法
 * */
public class MyThread extends Thread{
	public void run() {
		super.run();
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
