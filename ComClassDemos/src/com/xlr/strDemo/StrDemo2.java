package com.xlr.strDemo;
// 字符的所有操作并不影响字符串本身, 影响的是字符串的一个副本
public class StrDemo2 {
	public static void main(String[] args) {
		String s = "I love you!";
		String ns = s.substring(2, 6);
		System.out.println(ns);
		System.out.println(s);
	}
}
