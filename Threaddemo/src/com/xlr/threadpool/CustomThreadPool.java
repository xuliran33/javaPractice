package com.xlr.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPool {
	public static void main(String[] args) {
		// 创建一个自定义线程池
		ThreadPoolExecutor ex = new ThreadPoolExecutor(5, 7, 300, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(4));
		
		for(int i = 0 ; i < 12 ; i++) {
			ex.execute(new MyRunnable2(i));
			System.out.println("线程池中线程数" + ex.getPoolSize() + "等待执行的任务数" + ex.getQueue().size() + "已经执行完的任务数" + ex.getCompletedTaskCount());
		}
		
		ex.shutdown();
	}
	
}

class MyRunnable2 implements Runnable {
	// 第几个任务
	int num;
	
	public MyRunnable2(int num) {
		super();
		this.num = num;
	}

	public void run() {
		System.out.println("正在执行任务" + num);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("任务" + num + "执行完毕");
	}
	
}
