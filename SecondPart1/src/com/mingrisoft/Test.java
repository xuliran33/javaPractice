package com.mingrisoft;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Book1 book = new Book1("《Java从入门到精通 (第2版)》", "明日科技", 50);
		System.out.println("书名: " + book.getTitle());
		System.out.println("作者: " + book.getAuthor());
		System.out.println("价格" + book.getPrice() + "元");

		String[] titles = { "<<Java从入门到精通>>", "<<Java编程词典>>", "<<视频学Java>>" };

		for (int i = 0; i < 5; i++) {
			new Book1(titles[new Random().nextInt(3)]);
		}

		System.out.println("总计销售了" + Book1.getCounter() + "本图书!");
		Cat cat1 = new Cat("Java", 12, 21.0, Color.BLACK);
		Cat cat2 = new Cat("C++", 12, 21.0, Color.WHITE);
		Cat cat3 = new Cat("Java", 12, 21.0, Color.BLACK);

		System.out.println("猫咪1号的哈希码: " + cat1.hashCode());
		System.out.println("猫咪2号的哈希码: " + cat2.hashCode());
		System.out.println("猫咪3号的哈希码: " + cat3.hashCode());

		System.out.println("猫咪1号是否与猫咪2号相同: " + cat1.equals(cat2));
		System.out.println("猫咪1号是否与猫咪3号相同: " + cat1.equals(cat3));

		System.out.println("创建单例1对象: ");
		Emperor emperor1 = Emperor.getInstance();
		emperor1.getName();

		System.out.println("创建单例2对象: ");
		Emperor emperor2 = Emperor.getInstance();
		emperor2.getName();

		System.out.println("创建单例3对象: ");
		Emperor emperor3 = Emperor.getInstance();
		emperor3.getName();

		Rectangle rectangle = new Rectangle(10.4, 5.4);

		System.out.println("矩形面积为" + String.format("%.2f", rectangle.calculateArea()));

		Employee employee = new Employee(); // 创建Employee对象并为其赋值
		employee.setName("Java");
		employee.setSalary(100);
		employee.setBirthday(new Date());

		Manager manager = new Manager();
		manager.setName("明日科技");
		manager.setSalary(3000);
		manager.setBirthday(new Date());
		manager.setBonus(2000);
		
		System.out.println(employee.toString());
		System.out.println(manager.toString());
		
		Circle1 cirle = new Circle1(1); // 创建圆形对象, 并将半径设置成1
		System.out.println("图形的名称是: " + cirle.getName());
		System.out.println("图形的面积是: " + cirle.getArea());
		
		Rectangle1 rectangle1 = new Rectangle1(1, 1);
		System.out.println("图形的名称是: " + rectangle1.getName());
		System.out.println("图形的面积是: " + rectangle1.getArea());
		
		Student student = new Student();
		Class<?>clazz = student.getClass();		// 或得代表student对象的Class对象
		System.out.println("类的标准名称: " + clazz.getCanonicalName());
		
		try {
			Field id = clazz.getDeclaredField("id");
			System.out.println("设置前的id: " + student.getId());
			id.setAccessible(true);
			id.setInt(student, 10);;
			System.out.println("设置后的id: " + student.getId());
			
			Field name = clazz.getDeclaredField("name");
			System.out.println("设置前的 name: " + student.getName());
			name.setAccessible(true);
			name.set(student, "明日科技");
			System.out.println("设置后的 name: " + student.getName());
			
			Field  male = clazz.getDeclaredField("male");
			System.out.println("设置前的male: " + student.isMale());
			male.setAccessible(true);
			male.setBoolean(student, true);
			System.out.println("设置后的male: " + student.isMale());
			
			Field account = clazz.getDeclaredField("account");
			System.out.println("设置前的 account: " + student.getAccount());
			account.setAccessible(true);
			account.setDouble(student, 123.1);
			System.out.println("设置后的account: " + student.getAccount());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		// 抽象类不可以实例化
//		Car1 car = new Car1();
		
		AlarmClock clock = new AlarmClock(1000, true);
		clock.start();
		
		double[] array = new double[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = 100 * Math.random();
		}
		System.out.println("源数组: ");
		for (int i = 0; i < array.length; i++) {	// 显示数组中的各个元素
			System.out.println(array[i]);
		}
		
		System.out.println("最大值: " + MaxMin.getResult(array).getMax());
		System.out.println("最小值: " + MaxMin.getResult(array).getMin());
	}

}
