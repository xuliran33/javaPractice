package com.xlr.phone;

import com.xlr.lock.TakePhoto;

public class HTCPhone extends Phone implements TakePhoto, ConnectInternet, PlayVedio{

	public HTCPhone(String brand, String type) {
		super(brand, type);
	}

	@Override
	public void sendMsg() {
		
		System.out.println("发送带图片的文字信息");
		
	}

	@Override
	public void makeAPhone() {
		System.out.println("开始视频通话");
		
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		System.out.println("咔嚓, 拍照成功");
	}

	@Override
	public void playVedio(String vedio) {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频" + vedio);
	}

	@Override
	public void connectInternet() {
		// TODO Auto-generated method stub
		System.out.println("已经启动移动网络");
	}

	

}
