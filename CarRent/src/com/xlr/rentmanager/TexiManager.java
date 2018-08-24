package com.xlr.rentmanager;

import java.util.Scanner;

import com.xlr.RentCar.Car;
import com.xlr.RentCar.Texi;

public class TexiManager extends CarManager {
	String[] brands = {"宝马", "别克"};
	String[][] model = {{"x6", "5501"}, {"林荫大道", "GL8"}};
	Car[][] bus;
	
	public TexiManager() {
		Texi baoma1 = new Texi(brands[0], "京NY28588", 800, model[0][0]);
		Texi baoma2 = new Texi(brands[0], "京NY28589", 600, model[0][1]);
		Texi bieke1 = new Texi(brands[1], "京NY28590", 300, model[1][0]);
		Texi bieke2 = new Texi(brands[1], "京NY28591", 600, model[1][1]);
		this.bus = new Car[][] {{baoma1, baoma2}, {bieke1, bieke2}};
	}
	
	
	@Override
	public void rent() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入品牌编号" + "1. " + this.brands[0] + " 2. " + this.brands[1]);
		int brandNo = input.nextInt();
		if(!noReal(brandNo, this.brands)) {
			return;
		}
		System.out.println("请输入车型编号" + "1. " + this.model[brandNo - 1][0] + " 2. " +  this.model[brandNo - 1][1]);
		int countNo = input.nextInt();
		if(!noReal(countNo, this.model[brandNo - 1])) {
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
