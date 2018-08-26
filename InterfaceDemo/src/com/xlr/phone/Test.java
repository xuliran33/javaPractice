package com.xlr.phone;

public class Test {
	public static void main(String[] args) {
		SonyPhone sony = new SonyPhone("索尼", "G502c");
		sony.print();
		sony.playMusic("胎教音乐");
		sony.sendMsg();
		sony.makeAPhone();

		System.out.println("********************");
		
		HTCPhone htc = new HTCPhone("HTC", "I9100");
		htc.print();
		htc.connectInternet();
		htc.playVedio("延禧攻略");
		htc.takePhoto();
		htc.sendMsg();
		htc.makeAPhone();
	}
}
