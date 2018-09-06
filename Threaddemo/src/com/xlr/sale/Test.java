package com.xlr.sale;
/**
 * 模拟多人抢票
 * 当多个线程共享同一资源时, 一个线程未完成全部操作时, 其他线程修改数据, 造成数据不安全问题
 * 使用线程同步, 解决问题 关键字 synchronize给线程上锁
 * 同步方法, 同步代码块
 * 同一时刻只能有一个线程进入synchronize(this)同步代码块
 * 当一个线程访问synchronize(this)同步代码块时, 其他synchronize(this)同步代码块同样被锁定
 * 当一个线程访问synchronize(this)同步代码块时, 其他线程可以访问该资源的非synchronize(this)同步代码
 * */
public class Test {
	public static void main(String[] args) {
		Sale3 sale = new Sale3();
		Thread person1 = new Thread(sale, "桃跑跑");
		Thread person2 = new Thread(sale, "抢票代理");
		Thread person3 = new Thread(sale, "黄牛党");
		person1.start();
		person2.start();
		person3.start();
	}
}
