package com.xlr.enumdemo;
// 根据用户给的数字, 告知该数字(1-7)对应的日期该做什么事情
public class Test {
	public void doWhat(Week day) {
		switch (day) {
		case MON:
		case TUE:
		case WED:
		case THU:
		case FRI:
			System.out.println("工作日, 努力工作! ");
			break;
		case SAT:
			System.out.println("星期六, 看电影! ");
			break;
		case SUN:
			System.out.println("星期天, 好好休息! ");
			break;
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.doWhat(Week.MON);
	}
}
