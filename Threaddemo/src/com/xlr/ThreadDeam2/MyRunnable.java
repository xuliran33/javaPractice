package com.xlr.ThreadDeam2;

public class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "运行" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 3) {
				System.out.println(Thread.currentThread().getName() + "执行线程礼让");
				Thread.yield();
			}
		}

	}

}
