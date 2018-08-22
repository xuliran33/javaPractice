package com.xlr.extend;
/**
 * 子类继承了父类中用public和protected修饰的属性和方法
 * 继承默认权限修饰符修饰的属性和方法, 但子类和父类必须在同一个包里
 * 不能继承的 private修饰的, 不同包内默认修饰符修饰的, 构造方法(可调用, 不能继承)
 * */
public class Pet {
	private String name;
	private int age;
	private int health;
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Pet() {
		
	}
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void print() {
		
		System.out.println("name :" + name + "," + "age" + age);
	}
	
	// 生病去医院
	public void toHospital() {
	}
}
