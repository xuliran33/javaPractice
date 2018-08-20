package com.mingrisoft;

import java.util.Date;

public class Employee implements Comparable<Employee> {
	private String name;		// 员工的姓名
	private int id;			// 员工的编号
	private int age;			// 员工的年龄
	private double salary;	// 员工的工资
	private Date birthday;	// 员工的生日
	
	public Employee(int id, String name, int age) {	// 利用构造方法进行初始化
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Employee() {	// 利用构造方法进行初始化
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("员工的编号: " + id + ",");
		sb.append("员工的姓名: " + name + ",");
		sb.append("员工的年龄: " + age);
//		sb.append("员工的生日: " + birthday);
		return sb.toString();
		
		
	}

	@Override
	public int compareTo(Employee o) {		// 利用编号实现对象间的比较
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		}
		return 0;
	}
	
	
}
