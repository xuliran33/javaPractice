package com.xlr.strDemo;

import java.util.Scanner;

// 字符串常用方法: length() 注意其与数组的length属性的区别
// equals(): 比较两个字符串内容是否相等
// (1)equals() 和 ==  (2)创建了几个字符串对象
// (1)String 重写了equals(), 比较了字符串内容, 字符串的"=="依然比较两个字符串是否为同一个对象

public class Register {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入用户名: ");
//		String userName = input.next();
//		System.out.println("请输入密码: ");
//		String pwd = input.next();
//		if (pwd.length() < 6) {
//			System.out.println("注册密码不足6位, 请重新注册");
//		}else {
//			if (userName.equals("Tom") && pwd.equals("111111")) {
//				System.out.println("登录成功");
//			}else {
//				System.out.println("登录失败");
//			}
//			
//		}
		// 创建了几个字符串对象
		String str1 = "hello";
		String str2 = new String("hello");
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2); // false
		
		// 字符串比较的其他方法
		String str3 = "hello";
		String str4 = "HELLO";
		// 忽略大小写比较
		System.out.println(str3.equalsIgnoreCase(str4)); // true
		// 把字符串转化为小写
		String str5 = str3.toLowerCase();
		String str6 = str4.toLowerCase();
		System.out.println(str5.equals(str6));
		// 把字符串转换为大写
		String str7 = str3.toUpperCase();
		String str8 = str4.toUpperCase();
		System.out.println(str7.equals(str8));
		
		// 去掉字符串两端的空格
		System.out.println("去掉字符串两端的空格: trim()     ".trim());
		
		// 字符串连接: concat()
		System.out.println("字符串链接: Concat() ".concat(str1));
		
//		String s1 = "hello";
//		String s2 = "hello";
//		System.out.println(s1.equals(s2)); // true
//		System.out.println(s1 == s2); // true
	}
	
}
