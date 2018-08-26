package com.xlr.lock;
// 防盗门
public class TheftProofDoor extends Door implements Lock, TakePhoto {

	@Override
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙, 往右转3圈, 锁上了");
	}

	@Override
	public void lockOpen() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙, 往左转3圈, 锁开了");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("开门");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关门");
	}

	@Override
	public void takePhoto() {
		System.out.println("有人来访, 拍照, 存档");
		
	}

}
