package com.xlr.objtest;

/**
 * Object类是所有类的直接或间接父类
 * 子类继承自Object类的部分方法
 * toString() 返回当前对象本身的有关信息, 按字符串对象返回 类名@对象哈希码
 * equals() 比较两个对象是否是同一个对象, 是则返回true
 * hashCode() 返回该对象的哈希代码值
 * getClass() 获取当前对象所属的类信息, 返回Class对象
 * **/

public class Student {
	// 学号
	private int sid;
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 体重
	private int weight;
	
	public Student() {
		
	}
	
	public Student(int sid, String name, int age, int weight) {
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "张三", 18, 50);
		Student s2 = new Student(1, "张三", 18, 50);
//		Student s2 = s1;
		// 默认情况下, equals()作用和'=='是一样的, 都是比较两个对象是否为同一个
		// 现实中, 如果学号和名字都相同, 我们认为就是同一个对象
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		// toString(): 输出学生对象的字符串表示 ->> 学生的姓名
		System.out.println(s1.toString());
	}
	
	// 重写equals()方法: 告诉计算机一个新的比较规则, 如果学号和名字都相同, 我们认为就是同一个对象
	// 把传过来的obj对象和this(当前学员对象比较)
	// instanceof 判断某一个对象是否属于某一种类型
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		
		// 将obj强转为Student
		Student s = (Student)obj;
		if (this.sid == s.sid && this.name.equals(s.name)) {
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		return this.name;
	}
	
	
	
}
