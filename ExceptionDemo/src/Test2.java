import java.util.Scanner;
// 使用 try catch捕捉异常 try{} catch(异常Exception或Exception的子类对象){}
// (1)无异常, 执行try, 不进入catch, 直接执行后面的代码
// (2)有异常, 恰好和catch后面的异常匹配, 执行try, 遇到异常, 跳到catch中的代码, 执行后, 继续执行catch(){}后面的代码
// (3)有异常, 但是和catch后面的异常类型不匹配: try --> 中断程序

// 常见异常
// Exception 异常层次结构的父类
// ArithmeticException 算数错误清醒, 如以零做除数
// ArrayIndexOutOfBoundsException 数组下标越界
// NullPointerException 尝试访问null对象成员
// ClassNotFoundException 不能加载所需的类
// IllegalArgumentException 方法接收到非法参数
// ClassCastException 对象强制类型转换出错
// NumberFormatException 数字格式转换异常, 如把"abc"转换成数字
// InputMismatchException 输入类型不匹配
public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入被除数: ");
		
		try {
			int num1 = input.nextInt();
			System.out.println("请输入除数: ");
			int num2 = input.nextInt();

			System.out.println(num1 + "/" + num2 + "=" + (num1/ num2));
		} catch(ArithmeticException e) {
			System.err.println("出现了错误操作! ");
			// 所有异常的父类 Exception, Exception的一个ArithmeticException, 除数为0的异常
			// 异常对象e; printStackTrace()打印异常堆栈信息
//			e.printStackTrace();
			// 打印异常的字符串提示信息
			System.out.println();
			System.out.println(e.getMessage());
		}
		
		System.out.println("感谢使用本程序! ");

	}
}
