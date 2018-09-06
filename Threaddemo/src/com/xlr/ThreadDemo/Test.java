package com.xlr.ThreadDemo;
// 继承Thread类和实现Runnable 的区别
// 编写简单, 可直接操作线程
// 适用于单继承
// 实现Runnable接口 --> 推荐
// 避免单继承局限性
// 便于共享资源


//线程调度
//setPriority(int newPriority) 更改线程的优先级 1~10 , 1最低, 默认为5, 优先级高的线程获得CPU资源的概率较大
//public final void sleep() 在指定的毫秒数内让当前正在执行的线程休眠
//public final void join() 等待该线程终止
//public final void yield() 暂停当前正在执行的线程对象, 并执行其他线程
//public final void interrupt() 中断线程
//isAlive() 测试线程是否处于活动状态


public class Test {
	public static void main(String[] args) {
//		MyThread mt1 = new MyThread();
		// 启动线程
//		mt1.start();
//		mt1.run(); // 1. 只有主线程一条执行路径 2. 依次调用了两次run()方法
//		MyThread mt2 = new MyThread();
//		mt2.start();
//		mt2.run();
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r, "myThread1");
		t.start();
		t.setPriority(Thread.MAX_PRIORITY);
		
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1, "myThread2");
		t1.start();
		t.setPriority(Thread.MIN_PRIORITY);
		
	}
}
