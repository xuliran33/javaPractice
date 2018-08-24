package com.xlr.RentCar;
// 汽车类
public abstract class Car {
	// 品牌
	private String brand;
	// 车牌号
	private String plateNo;
	// 日租金
	private double dayMoney;
	// 出租天数
	private int dayCount;
	// 总价格
	private double totalMoney;
	
	// 计算租金
	public abstract void calculateRendMoney();
	
	public Car(String brand, String plateNo, double dayMoney) {
		this.brand = brand;
		this.plateNo = plateNo;
		this.dayMoney = dayMoney;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public double getDayMoney() {
		return dayMoney;
	}
	public void setDayMoney(double dayMoney) {
		this.dayMoney = dayMoney;
	}


	public int getDayCount() {
		return dayCount;
	}


	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}


	public double getTotalMoney() {
		return totalMoney;
	}


	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
}
