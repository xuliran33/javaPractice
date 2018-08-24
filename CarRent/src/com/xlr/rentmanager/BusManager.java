package com.xlr.rentmanager;
import java.util.Scanner;

import com.xlr.RentCar.Bus;
import com.xlr.RentCar.Car;

public class BusManager extends CarManager {
	String[] brands;
	String[] count;
	Car[][] bus;
	public BusManager() {
		String brand1 = "金杯";
		String brand2 = "金龙";
		String count1 = "16";
		String count2 = "32";
		this.brands = new String[] {brand1, brand2};
		this.count = new String[] {count1, count2};
		Car jibei16 = new Bus(brand1, "京6566754", 800, Integer.parseInt(count1));
		Car jilong16 = new Bus(brand2, "京6566755", 800, Integer.parseInt(count1));
		Car jibei32 = new Bus(brand1, "京6566756", 1500, Integer.parseInt(count2));
		Car jilong32 = new Bus(brand2, "京6566757", 1500, Integer.parseInt(count2));
		Car[] jinBeiArray = {jibei16, jibei32};
		Car[] jinLongArray = {jilong16, jilong32};
		this.bus = new Car[][] {jinBeiArray, jinLongArray};
		
	}
	
	@Override
	public void rent() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入品牌编号" + "1. " + this.brands[0] + " 2. " + this.brands[1]);
		int brandNo = input.nextInt();
		if(!(noReal(brandNo, brands))) {
			return;
		}
		System.out.println("请输入座位数编号" + "1. " + this.count[0] + "座 2. " +  this.count[1] + "座");
		int countNo = input.nextInt();
		if(!noReal(countNo, count)) {
			return;
		}
		System.out.println("请输入租赁天数");
		int days = input.nextInt();
		if (days < 0) {
			System.out.println("输入错误");
			return;
		}
		Car car = this.bus[brandNo - 1][countNo - 1];
		car.setDayCount(days);
		car.calculateRendMoney();
	}
	
	
}
