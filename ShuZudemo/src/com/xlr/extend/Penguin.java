package com.xlr.extend;
// 企鹅类
public class Penguin extends Pet {
	String sex = "q仔";	// 性别

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void print() {
		super.print();
		System.out.println("我的性别是: " + sex);
	}
	
	@Override
	public void toHospital() {
		// TODO Auto-generated method stub
		if (this.getHealth() < 50) {
			System.out.println("吃药, 疗养");
			this.setHealth(70);
		}
	}
	
	@Override
	public void eat() {
		System.out.println("吃条小鱼");
		this.setHealth((this.getHealth() + 5) > 100 ? 100 : (this.getHealth() + 5));
		
	}
}
