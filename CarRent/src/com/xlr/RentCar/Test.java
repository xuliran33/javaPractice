package com.xlr.RentCar;

import java.util.Scanner;
import com.xlr.rentmanager.*;

public class Test {
	public static void main(String[] args) {
		CarManager[] manager = {new TexiManager(), new BusManager()};
		Scanner input = new Scanner(System.in);
		System.out.println("请输入租车类型编号: 1. 轿车 2. 客车");
		int no = input.nextInt();
		if (no < 1 || no > 2) {
			System.out.println("输入错误");
			return;
		}
		
		manager[no-1].rent();
	}
}
