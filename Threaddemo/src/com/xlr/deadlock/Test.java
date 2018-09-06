package com.xlr.deadlock;
/**
 * 模拟死锁
 * */
public class Test {
	public static void main(String[] args) {
		Object bo = new Object();
		Object du = new Object();
		Thread tang = new Thread(new Tangang(bo,du));
		Thread dou = new Thread(new DouDou(bo,du));
		
		tang.start();
		dou.start();
	}
}

class Tangang implements Runnable {
	Object bobby; // 芭比
	
	Object duck;	// 玩具鸭
	
	public Tangang(Object bobby, Object duck) {
		super();
		this.bobby = bobby;
		this.duck = duck;
	}
	
	public void run() {
		synchronized (bobby) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (duck) {
				
			}
			System.out.println("糖糖把芭比给豆豆玩");
		}
	}

}

class DouDou implements Runnable{
	Object bobby; // 芭比
	Object duck;	// 玩具鸭
	
	
	public DouDou(Object bobby, Object duck) {
		super();
		this.bobby = bobby;
		this.duck = duck;
	}


	public void run() {
		synchronized (duck) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (bobby) {
				
			}
			System.out.println("豆豆把玩具鸭给糖糖玩");
		}
	}
}
