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
		
		Pet penguin = new Penguin();
		master.cure(penguin);
		System.out.println(penguin.getHealth());
	}
}
