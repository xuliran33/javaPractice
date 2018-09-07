package com.xlr.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 线程池
// 为什么使用线程池
// 线程缺乏统一管理, 占用过多系统资源
// 缺乏更多功能, 如定时执行, 定期执行等
// 线程池的好处
// 重用存在的线程, 减少对象创建, 消亡的开销
// 有效控制最大并发数, 提高系统资源使用率
// 定时执行, 定期执行

// 线程池的创建方法
// newCachedThreadPool()	 创建一个可缓存的线程池, 有任务时才创建新任务
// newSingleThreadExecutor() 创建一个单线程池
// newFixedThreadPool(int n Threads) 创建一个固定长度的线程池, 空闲线程会一直保留, 参数nThreads设定线程池中线程的数目
// newScheduledThreadPool(int corePoolSize) 创建了一个固定长度的线程池, 而且以延迟或定时的方式来执行任务

// 用newCachedThreadPool() 方法创建线程池
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService cachedThreadPool =  Executors.newCachedThreadPool();
		
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

//class MyRunnable implements Runnable{
//	int num;
//	
//	public MyRunnable(int num) {
//		super();
//		this.num = num;
//	}
//
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + ":" + num);
//	}
//}
