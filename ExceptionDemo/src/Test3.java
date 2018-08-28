import java.util.InputMismatchException;
import java.util.Scanner;
// try -catch - finally, try语句块是必须的, catch, finally语句均可选, 但必须出现其一
// finally中的代码不管是否捕捉到异常都执行
// 在finally前出现 System.exit(1)时不执行finally中的程序
// 面试题 try-catch块中存在return语句, 是否还执行finally块. 如果执行, 说出执行顺序
// try -catch - finally块中, finally块唯一不执行的情况是什么?

// 使用场景: 程序中发生异常时, 占用一些系统资源, 释放资源时使用, 比如关闭数据库, 关闭输入输出流

/*
 * 多重catch块
 * 排列catch语句的顺序, 先子类, 后父类
 * 发生异常时按顺序逐个匹配
 * 只执行第一个与异常类型匹配的catch语句
 * 尽量精确捕获异常
 * */
public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入被除数: ");
		
		try {
			int num1 = input.nextInt();
			System.out.println("请输入除数: ");
			int num2 = input.nextInt();

			System.out.println(num1 + "/" + num2 + "=" + (num1/ num2));
			// 正常执行完后执行finally后再执行return
//			return;
		} catch (ArithmeticException e) {
			System.err.println("出现了错误操作! ");
			e.printStackTrace();
			System.out.println();
			
//			System.exit(1);
			// 先执行finally中的程序, 再执行return
//			return;
		} catch (InputMismatchException e) {
			System.err.println("输入类型不匹配 ");
			e.printStackTrace();
			System.out.println();
		} catch (Exception e) {
			System.err.println("出现了其他的异常 ");
			e.printStackTrace();
			System.out.println();
		} finally {
			System.out.println("感谢使用本程序! ");
		}
	}
}
