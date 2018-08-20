package com.mingrisoft;

public class Zoo {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("执行 dog.cry();语句时输出的结果: ");
		dog.cry();
		
		Cat1 cat = new Cat1();
		System.out.println("执行 cat.cry();语句时输出的结果: ");
		cat.cry();
		
		Sheep sheep = new Sheep();
		System.out.println("执行 sheep.cry();语句时输出的结果: ");
		sheep.cry();
	}
}
