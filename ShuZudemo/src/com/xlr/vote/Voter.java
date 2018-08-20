package com.xlr.vote;
/**
 * 模拟选民投票过程: 一群选民投票, 每个选民只允许头一次, 并且当总票数达到100时停止投票
 * */ 
// 选民类
// 投票总数为所有选民都会改变的同一个数量
// 100 最大投票数, 适用于全部选民
public class Voter {
	private static int count;
	private static final int MAX_COUNNT = 100;
	private String name;
	
	public Voter() {
		
	}
	
	public Voter(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// 投票方法
	public void voteFor() {
		if (count == MAX_COUNNT) {
			System.out.println("投票活动已经结束!");
			return;
		}else {
			count++;
			System.out.println(name + "感谢您投票! ");
		}
	}
	
	// 打印投票结果
	public static void print() {
		System.out.println(count);
	}
}
