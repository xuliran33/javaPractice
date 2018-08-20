package com.mingrisoft;

public class Compare {
	public static void mian(String[] args) {
		String c1 = new String("abc");
		String c2 = new String("abc");
		String c3 = c1;
		// == 比较的是引用地址
		System.out.println("c2 == c3 的运算结果为" + (c2 == c3));
		System.out.println("c2.equals(c3)的运算结果为: " + (c2.equals(c3)));
	}
}
