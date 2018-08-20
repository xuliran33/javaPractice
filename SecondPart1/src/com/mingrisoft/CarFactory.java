package com.mingrisoft;

public class CarFactory {
	public static Car1 getCar(String name) {
		// equalsIgnoreCase不区分大小写比较
		if (name.equalsIgnoreCase("BMW")) {
			return new BMW();
		}else if (name.equalsIgnoreCase("Benz")) {
			return new Benz();
		} else {
			return null;
		}
	}
}
