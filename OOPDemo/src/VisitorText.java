import java.util.Scanner;

// 测试游人类
public class VisitorText {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "";
		do {
			Visitor v = new Visitor();
			System.out.print("请输入乘客姓名");
			v.name = input.next();
			
			System.out.print("请输入乘客年龄");
			v.age = input.nextInt();
			
			v.getPrice();
			System.out.println("是否继续(y/n)?");
			answer = input.next();
		} while (answer.equals("y"));
		System.out.println("退出程序");
	}
}
