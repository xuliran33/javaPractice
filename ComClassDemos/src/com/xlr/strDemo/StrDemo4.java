package com.xlr.strDemo;

import java.util.Scanner;

// 作业提交
public class StrDemo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***********欢迎提交作业***********");
		System.out.println("请输入作业名: ");
		String name = input.next();
		System.out.println("请输入邮箱: ");
		String email = input.next();
		
		// 检查文件名, 必须以.java为后缀
		int index = name.lastIndexOf(".");
		boolean nameFlage = false;
		if (index != -1 && index != 0 && name.substring(index).equals(".java")) {
			nameFlage = true;
		}else {
			System.out.println("文件名无效");
		}
		
		// 检查邮箱 @ .
		// @的位置
		int index1 = email.indexOf("@");
		// .的位置
		int index2 = email.indexOf(".");
		boolean emailFlag = false;
		if (index1 != -1 && index2 != -1 && index1 < index2) {
			emailFlag = true;
		}else {
			System.out.println("邮箱无效");
		}
		
		if (emailFlag && nameFlage) {
			System.out.println("作业提交成功");
		}else {
			System.out.println("作业提交失败");
		}
	}
}
