package com.xlr.phone;

public abstract class Phone {
	// 型号
	private String type;
	// 品牌
	private String brand;
	
	public Phone(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public void print() {
		System.out.println("这是一款型号为" + this.type + "的" + this.brand + "手机");
	}
	
	// 发短信
	public abstract void sendMsg();
	
	// 打电话
	public abstract void makeAPhone();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
}
