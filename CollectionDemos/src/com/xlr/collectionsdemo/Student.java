package com.xlr.collectionsdemo;

public class Student implements Comparable{
	private String name;
	private String sex;
	private int number;
	
	public Student(String name, String sex, int number) {
		super();
		this.name = name;
		this.sex = sex;
		this.number = number;
	}
	
	
	
	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}


	// 编写比较规则, 已学员的学号为比价规则, 学号大的, 学员大
	public int compareTo(Object o) {
		Student st = (Student)o;
		if(this.number == st.number) {
			return 0;
		}else if(this.number > st.number) {
			return 1;
		}else {
			return -1;
		}
		
	}
}
