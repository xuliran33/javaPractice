package com.xlr.RentCar;
// 轿车
public class Texi extends Car{
	// 型号
	private String model;
	
	// 初始化
	public Texi(String brand, String plateNo, double dayMoney, String model) {
		super(brand, plateNo, dayMoney);
		this.model = model;
	}
	
	// 计算租金
	public void calculateRendMoney() {
		
		if (this.getDayCount() >= 7 && this.getDayCount() < 30) {
			this.setTotalMoney(this.getDayCount() * this.getDayMoney() * 0.9);
		}else if(this.getDayCount() >= 30 && this.getDayCount() < 150) {
			this.setTotalMoney(this.getDayCount() * this.getDayMoney() * 0.8);
		}else if(this.getDayCount() >= 150) {
			this.setTotalMoney(this.getDayCount() * this.getDayMoney() * 0.7);
		}else {
			this.setTotalMoney(this.getDayCount() * this.getDayMoney());
		}
		
		System.out.println("租赁价格: " + this.getTotalMoney() + "车牌号" + this.getPlateNo());
		
	}
}
