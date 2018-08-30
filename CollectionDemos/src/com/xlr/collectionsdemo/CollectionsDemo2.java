package com.xlr.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("张三", "男", 5));
		list.add(new Student("小花", "女", 2));
		list.add(new Student("小兰", "女", 3));
		list.add(new Student("jack", "男", 4));
		
		// 升序
		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student.getNumber() + "\t" + student.getName() + "\t" +  student.getSex());
		}
	}
}
