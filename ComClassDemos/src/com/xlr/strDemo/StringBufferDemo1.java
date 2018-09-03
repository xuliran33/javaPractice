package com.xlr.strDemo;

import java.util.Scanner;

public class StringBufferDemo1 {
	public static void main(String[] args) {
		// String ---> StringBuffer
		// StringBuffer 操作后变化的是字符串本身
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println(s1);
		// StringBuffer ---> String
//		String s = s1.toString();
		s1.append(" world!");
		System.out.println(s1);
		// 在某一个位置插入xxx
		s1.insert(1, ",");
		System.out.println(s1);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入一串数字");
		String num = input.next();
		StringBuffer s2 = new StringBuffer(num);
		
		for (int i = num.length() - 3; i > 0; i = i - 3) {
			s2.insert(i, ",");
		}
		System.out.println(s2);
	}
}
