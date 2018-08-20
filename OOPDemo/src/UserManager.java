import java.util.Scanner;

// 用户管理类
public class UserManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		User user = new User();
		user.name = "admin";
		user.password = "123456";
		
		System.out.print("请输入用户名:");
		String name = input.next();
		System.out.print("请输入密码:");
		String pwd = input.next();
		
		if (user.name.equals(name) && user.password.equals(pwd)) {
			System.out.print("请输入新密码:");
			user.password = input.next();
			System.out.println("密码更新成功");
		}else {
			System.out.println("用户名或密码错误, 您没有权限更新");
		}
	}
}
