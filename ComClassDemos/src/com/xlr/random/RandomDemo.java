package com.xlr.random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		// 创建随机数生成器, 每次创建的种子不一样, 用不同的种子生成的随机数是不同的, 相同的种子构造的两个随机数是相同的
		Random random = new Random();
		// 生成10个随机数
		for (int i = 0; i < 10; i++) {
			// 生成一个随机整数
			System.out.println("带参方法: " + random.nextInt(10)); // 0-10(不包括10)
		}
		
		System.out.println("不带参方法: " + random.nextInt());
	}
}
