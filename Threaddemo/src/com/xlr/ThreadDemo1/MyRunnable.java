package com.xlr.ThreadDemo1;

public class MyRunnable implements Runnable {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		System.out.println("线程t处于新建状态");
		t.start();
		System.out.println("线程t处于就绪状态");
	}
	
	public void run() {
		System.out.println("线程正在运行! ");
		try {
			// 线程休眠500毫秒
			Thread.sleep(500);
			System.out.println("线程t休眠, 处于阻塞状态");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("线程t被中断");
		}
	}

}
