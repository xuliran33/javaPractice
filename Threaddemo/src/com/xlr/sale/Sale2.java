package com.xlr.sale;
/**
 * 模拟网站
 * */
public class Sale2 implements Runnable{
	// 记录剩余票数
	private int count = 10;
	// 记录当前抢到第几张票
	private int num = 0;
	private boolean flag = false; // 记录票是否卖完
	public void run() {	
		// 循环, 当剩余票数为0时结束
		while (!flag) {
			sale();
		}
		
	}
	
	public synchronized void sale() {
		if (count <= 0) {
			flag = true;
			return;
		}
		// 1. 修改数据, 网站剩余票数, 当前抢到第几张票
		count--;
		num++;
		// 2. 显示信息, 反馈用户抢到第几张票
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "抢到第" + num + "张票, 剩余" + count + "张票");
	}
}
