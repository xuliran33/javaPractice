package com.xlr.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 用newSingleThreadExecutor() 方法创建线程池
public class ThreadPoolDemo3 {
	public static void main(String[] args) {
		ExecutorService cachedThreadPool =  Executors.newFixedThreadPool(3);
		
		// 在线程池中执行10个任务
		for (int i = 0; i < 10; i++) {
			cachedThreadPool.execute(new MyRunnable(i));
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

