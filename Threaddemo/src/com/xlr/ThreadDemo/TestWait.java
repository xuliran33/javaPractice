package com.xlr.ThreadDemo;
// 将主线程休眠5秒钟
public class TestWait {
	public static void main(String[] args) {
		System.out.println("-----------主线程开始休眠------");
		Wait.bySec(5);	// 让主线程休眠5s
		System.out.println("-----------主线程休眠结束------");
	}
}
