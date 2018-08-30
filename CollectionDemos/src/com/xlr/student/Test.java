package com.xlr.student;

import java.util.HashMap;
import java.util.Scanner;

// 泛型
// 将对象的类型作为参数, 指定到其他类或方法上, 从而保证类型转换的安全性和稳定性, 本质是参数化类型

public class Test {
	public static void main(String[] args) {
		HashMap<String, Student> stus = new HashMap<String, Student> ();
		stus.put("Jack", new Student("张三", "男"));
		stus.put("Lisa", new Student("李四", "男"));
		stus.put("Tom", new Student("王五", "女"));
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要寻找的学员英文名: ");
		String key = input.next();
		if (stus.containsKey(key)) {
			Student stu = stus.get(key);
			System.out.println("您要找的学员是: " + stu.getName() + stu.getSex());
		}else {
			System.out.println("没有找到该学员");
		}
	}
}
