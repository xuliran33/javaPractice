package com.mingrisoft;

public class Car {
	public String name;
	private double speed;
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("车名: " + name + ",");
		sb.append("速度: " + speed + "千米/小时");
		return sb.toString();
	}

}
