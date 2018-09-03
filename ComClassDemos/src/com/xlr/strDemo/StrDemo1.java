package com.xlr.strDemo;
// 字符串截取: indexOf() lastIndexOf() subString(beginIndex) subString(beginIndex, endIndex)
public class StrDemo1 {
	public static void main(String[] args) {
		String s = "hello, my name is xxx, ok";
		System.out.println(s.indexOf("o"));
		System.out.println(s.lastIndexOf("o"));
		System.out.println(s.substring(4));	// 截取时, 包含起始位置, 不包含结束位置
		System.out.println(s.substring(4, 5));
	}
}
