package com.xlr.oop.inherit;

public class Student extends Person {
	private String sid;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public void m1() {
		super.getAge();
		super.getName();
	}
}
