package com.mingrisoft;

public class Manager extends Employee {
	private double bonus;	// 经理的奖金

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("经理的姓名: " + super.getName() + ",");
		sb.append("经理的工资: " + super.getSalary() + ",");
		sb.append("经理的生日: " + super.getBirthday() + ",");
		sb.append("经理的奖金: " + bonus);
		return sb.toString();
	}
}
