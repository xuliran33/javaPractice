package com.xlr.strDemo;

import java.util.Scanner;

// 查找字符串在字符串中出现的次数
public class StrDemo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字符串: ");
		String str = input.next();
		System.out.println("请输入要查找的字符串:");
		String findStr = input.next();
		int count = 0;
		for (int i = 0; i < str.length() - findStr.length() + 1; i++) {
			String temp = str.substring(i, i + findStr.length());
			if (temp.equals(findStr)) {
				count++;
			}
		}
		
		System.out.println("\"" + findStr + "\"" + "在字符串" + "\"" + str + "\"" + "中出现的次数为: " + count);
	}
}
