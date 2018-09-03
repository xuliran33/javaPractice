package com.xlr.strDemo;
// 字符串拆分方法
public class StrDemo3 {
	public static void main(String[] args) {
		String words = "长亭外 古道边 芳草碧连天";
		String[] strs = words.split(" ");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}
