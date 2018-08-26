package com.xlr.phone;


public class SonyPhone extends Phone implements PlayMusic {

	public SonyPhone(String brand, String type) {
		super(brand, type);
	}

	@Override
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("发送文字信息");
	}

	@Override
	public void makeAPhone() {
		System.out.println("开始语音通话");

	}

	@Override
	public void playMusic(String music) {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐<<" + music + ">>");
	}

}
