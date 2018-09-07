package com.xlr.threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// 用newSingleThreadExecutor() 方法创建线程池
public class ThreadPoolDemo4 {
	public static void main(String[] args) {
		ScheduledExecutorService cachedThreadPool =  Executors.newScheduledThreadPool(3);
		// 延时1秒中执行, 每2s中执行一次, 可以起到定时器的作用
		cachedThreadPool.scheduleAtFixedRate(new MyRunnable1(), 1, 2, TimeUnit.SECONDS);
		
	}
}

class MyRunnable1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

