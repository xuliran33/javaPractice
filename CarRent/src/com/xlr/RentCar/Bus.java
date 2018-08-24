package com.xlr.RentCar;
// 客车
public class Bus extends Car{
	// 座位数
	private int count;

	// 初始化
	public Bus(String brand, String plateNo, double dayMoney, int count) {
		super(brand, plateNo, dayMoney);
		this.count = count;
	}
	
	public void calculateRendMoney() {
		this.setTotalMoney(this.getDayCount() * this.getDayMoney());
		if (this.getDayCount() >= 3 && this.getDayCount() < 7) {
			this.setTotalMoney(this.getTotalMoney() * 0.9);
		}else if(this.getDayCount() >= 7 && this.getDayCount() < 30) {
			this.setTotalMoney(this.getTotalMoney() * 0.8);
		}else if(this.getDayCount() >= 30 && this.getDayCount() < 150) {
			this.setTotalMoney(this.getTotalMoney() * 0.7);
		}else if(this.getDayCount() >= 150) {
			this.setTotalMoney(this.getTotalMoney() * 0.6);
		}
		
		System.out.println("租赁价格: " + this.getTotalMoney() + "车牌号" + this.getPlateNo());
		
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
