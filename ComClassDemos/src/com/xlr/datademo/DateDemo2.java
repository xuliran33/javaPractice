package com.xlr.datademo;

import java.util.Calendar;

public class DateDemo2 {
	
	public static void main(String[] args) {
		// 日期和时间 Calendar-抽象类, 获取Calendar实例
		Calendar t = Calendar.getInstance();
		System.out.println(t.get(Calendar.YEAR) + "-" + (t.get(Calendar.MONTH) + 1) + "-" + t.get(Calendar.DAY_OF_MONTH));
		System.out.println("今天是星期几: " + (t.get(Calendar.DAY_OF_WEEK) - 1));
	}
	
	
}
