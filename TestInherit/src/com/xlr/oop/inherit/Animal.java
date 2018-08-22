package com.xlr.oop.inherit;
/**
 * option + command + S 后 General Getters and Setters 可以快速生成getter和setter方法
 * */

public class Animal {
	private String sex;
	private int age;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Animal name = new Animal();
		System.out.println(name.toString());
	}
	
}
