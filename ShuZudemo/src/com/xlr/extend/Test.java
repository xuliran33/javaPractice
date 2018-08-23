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
		// 向上转型
		// <父类型><引用变量名> = new <子类型>()
		// 此时通过父类引用变量调用的方法是子类覆盖或继承父类的方法, 不是父类的方法
		// 此时通过父类引用变量无法调用子类特有的方法
		Pet penguin = new Penguin();
		
		penguin.setName("企鹅");
		master.cure(penguin);
		System.out.println(penguin.getHealth());
		master.feed(penguin);
		
		// 向下转型, 类似强制类型转换
		// <子类型> <引用变量名> = (<子类型>)<父类型的引用变量>
		// 在向下转型的过程中, 如果没有转换为真实子类类型, 会出现类型转换异常java.lang.ClassCastException, 如在此处把penguin转换为dog, 编译可通过, 运行异常
		// 避免错误 instanceOf
		if (penguin instanceof Penguin) {
			Penguin p = (Penguin) penguin;
			p.setSex("Q妹");
		}
	
		penguin.print();
	}
}
