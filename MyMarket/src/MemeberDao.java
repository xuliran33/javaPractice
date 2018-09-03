import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

// 业务类
public class MemeberDao {
	Scanner input = new Scanner(System.in);
	ArrayList<Member> list = new ArrayList<Member>();
	
	public void start() {
		welcomeMsg();
		int chose = input.nextInt();
		switch (chose) {
		case 1:
			// 积分累计
			addScore();
			break;
		case 2:
			// 积分兑换
			changeScore();
			break;
		case 3:
			// 查询剩余积分
			showScore();
			break;
		case 4:
			// 修改密码
			resetPassword();
			break;
		case 5:
			// 开卡
			makeCard();
			break;
		case 6:
			System.out.println("感谢您使用超市积分管理系统");
			System.exit(0);
		default:
			System.out.println("您的操作有误, 请重新选择");
			break;
		}
		
		start();
	}
	
	// 输出欢迎信息
	public void welcomeMsg() {
		System.out.println("*************欢迎进入超市管理系统*************");
		System.out.println("1.积分累计\t2.积分兑换\t3.查询剩余积分\t4.修改密码\t5.开卡\t6.退出");
		System.out.println("***************************************");
		System.out.print("请选择: ");
	}
	
	// 积分累计
	public void addScore() {
		Member m = findMember();
		if (m == null) {
			System.out.println("会员卡号或密码错误!");
		}else {
			System.out.print("请输入本次消费金额: ");
			int score = input.nextInt();
			m.setScore(m.getScore() + score);
			System.out.println("积分累计成功, 剩余积分" + m.getScore());
		}
	}
	
	// 积分兑换
	public void changeScore() {
		Member m = findMember();
		if (m == null) {
			System.out.println("会员卡号或密码错误!");
		}else {
			System.out.print("请输入要兑换的积分: ");
			int score = input.nextInt();
			if (score > m.getScore()) {
				System.out.println("积分兑换失败, 要兑换的积分大于当前积分");
			}else {
				m.setScore(m.getScore() - score);
				System.out.println("积分兑换成功, 本次积分抵扣" + score / 100 * 0.1 + "元");
			}
		}
	}
	
	// 查询剩余积分
	public void showScore() {
		Member m = findMember();
		if (m == null) {
			System.out.println("会员卡号或密码错误!");
		}else {
			System.out.println("会员卡号\t用户名\t积分\t开卡日期");
			System.out.println(m.getCarId() + "\t" + m.getName() + "\t" + m.getScore() + "\t" + m.getRegisterDate());
		}
		
	}
	
	// 修改密码
	public void resetPassword() {
		Member m = findMember();
		if (m == null) {
			System.out.println("会员卡号或密码错误!");
		}else {
			System.out.print("请输入新密码: ");
			String password;
			do {
				password = input.next();
				if (password.length() < 6) {
					System.out.print("密码应大于6位请重新输入: ");
				}
			} while (password.length() < 6);
			m.setPassword(password);
			System.out.println("密码修改成功");
		}
	}
	
	// 开卡
	public void makeCard() {
		System.out.print("请输入用户名: ");
		String name = input.next();
		String password;
		System.out.print("请输入密码(大于6位): ");
		do {
			password = input.next();
			if (password.length() < 6) {
				System.out.print("密码应大于6位请重新输入: ");
			}
		} while (password.length() < 6);
		
		Date date = new Date();
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");
		String registerDate = fm.format(date);
		int carId = makeCardNo();
		Member m = new Member(name, carId, password, 100, registerDate);
		list.add(m);
		
		System.out.println("开卡成功, 会员卡号为: " + carId);
	}
	
	// 生成随机卡号
	public int makeCardNo() {
		Random rand = new Random();
		int no = rand.nextInt(9999999);
		for (Member member : list) {
			if (member.getCarId() == no) {
				no = rand.nextInt(9999999);
			}
		}
		return no;
	}
	
	// 查询会员是否存在
	public Member findMember() {
		System.out.print("请输入会员卡号: ");
		int carId = input.nextInt();
		System.out.print("请输入会员卡密码: ");
		String pwd = input.next();
		for (Member member : list) {
			if (member.getCarId() == carId && member.getPassword().equals(pwd)) {
				return member;
			}
		}
		return null;
	}
	
}
