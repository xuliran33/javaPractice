import java.util.Scanner;
/**
 * 传统方式处理异常: 更改代码, 问题: 代码臃肿, 花费精力处理异常, 很难处理所有异常
 * 异常处理机制: 提供了错误处理的能力, 处理异常后程序继续运行
 * 异常: 指在程序的运行过程中发生的不正常事件, 中断正在运行的程序
 * 异常处理的5个关键字: try, catch, finally, throw, throws
 * */
public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入被除数: ");
		int num1 = input.nextInt();
		
		System.out.println("请输入除数: ");
		int num2 = 0;
		if (input.hasNextInt()) {
			// 录入的是一个整数
			num2 = input.nextInt();
			if (num2 == 0) {
				System.err.println("输入的除数是0, 程序退出");
				System.exit(1);
			}else {
				System.out.println(num1 + "/" + num2 + "=" + (num1/ num2));
				System.out.println("感谢使用本程序! ");
			}
		} else {
			// 录入的不是整数
			System.err.println("录入的数不是整数, 程序退出");
			// 传参为非0的数, 退出虚拟机
			System.exit(1);
		}
		
	}
}
