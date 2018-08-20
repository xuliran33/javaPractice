package com.mingrisoft;

public class HanoiTower {	// 汉诺塔问题求解
	public static void moveDish(int level, char from, char inter, char to) {
		if (level == 1) { // 如果只有一个盘子就退出迭代
			System.out.println("从 " + from + "移动盘子1号到 " + to);
		}else {
			moveDish(level - 1, from, to, inter);
			System.out.println("从 " + from + " 移动盘子 " + level + " 号到 " + to);
			moveDish(level - 1, inter, from, to);
		}
	}
	
	public static void main(String[] args) {
		int nDisks = 3;
		moveDish(nDisks, 'A', 'B', 'C');
	}

}
