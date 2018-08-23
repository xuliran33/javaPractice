package com.xlr.extend;

public class Test {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.setName("Tom");
//		dog.setAge(10);
//		dog.print();
		Dog dog = new Dog("Tom", 10, 30);
		dog.print();
		
		Master master = new Master();
		master.cure(dog);
		
		master.feed(dog);
		dog.print();
		
		System.out.println("******************");
		
		// 父类引用指向子类对象
		Pet penguin = new Penguin();
		penguin.setName("企鹅");
		master.cure(penguin);
		System.out.println(penguin.getHealth());
		master.feed(penguin);
		penguin.print();
	}
}
