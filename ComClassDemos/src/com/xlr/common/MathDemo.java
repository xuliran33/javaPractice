package com.xlr.common;

import java.util.Scanner;

public class MathDemo {
	// 会员随机中奖: 会员号百位数 == 计算机随机生成的数字
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个四位的会员号: ");
		int baiwei = input.nextInt() / 100 % 10;
		int random = (int)Math.random() * 10;
		if (baiwei == random) {
			System.out.println("中奖了");
		}else {
			System.out.println("没中奖");
		}
	}
}
