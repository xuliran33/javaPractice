import java.util.Scanner;

public class CheckLogin {
	private static Scanner scan;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		System.out.println("请输入登录用户名: ");
		String userNmae = scan.nextLine();
		System.out.println("请输入登录密码: ");
		String passWord = scan.nextLine();
		if (!userNmae.equals("mr")) {
			System.out.println("用户名非法");
		}else if (!passWord.equals("mrsoft")) {
			System.out.println("登录密码错误");
		}else {
			System.out.println("恭喜您, 登录信息通过验证");
		}
	}
}
