import java.util.InputMismatchException;
import java.util.Scanner;
// throws: 声明某个方法可能抛出的各种异常, 多个异常用逗号隔开
// 方式1 : 调用者处理异常
// 方式2 : 调用者继续声明异常, main()方法声明的异常由jvm处理

public class Test4 {
// 由main方法抛出异常, 由jvm处理
//	public static void main(String[] args) throws ArithmeticException, InputMismatchException{
//		Test4 t = new Test4();
//		t.divide();
//	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		
		
		try {
			t.divide();
		} catch (ArithmeticException e) {
			System.err.println("出现了错误操作! ");
			e.printStackTrace();
			System.out.println();

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
	
	// 求两个数的除法运算, 声明该方法可能会抛出两种异常
	public void divide() throws ArithmeticException, InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入被除数: ");
		int num1 = input.nextInt();
		System.out.println("请输入除数: ");
		int num2 = input.nextInt();

		System.out.println(num1 + "/" + num2 + "=" + (num1/ num2));
	}
}

// 异常处理原则
// 异常处理与性能: 如果没有异常, 对性能影响很小, try-catch放在一个方法中对性能影响也很小
// 异常只能用于非正常情况
// 需要对捕获的异常做处理
// 不要将过于庞大的代码块放到try中, 太多代码, 出现异常的情况很多, 不方便分析
// 在catch中指定具体的异常类型, 具体异常具体分析
