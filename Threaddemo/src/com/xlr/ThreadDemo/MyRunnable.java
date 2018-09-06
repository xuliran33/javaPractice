package com.xlr.ThreadDemo;
/**
 * 实现Runnable接口方式创建线程
 * 实现run()方法, 编写线程执行体
 * 创建线程对象, 调用start()方法启动线程
 * */
public class MyRunnable implements Runnable{

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

}
