
public class Decision {
	public static void main(String args[]) {
		String s1 = "Mrkj007";
		String s2 = "mrkj007";
		String m1 = "\\p{Upper}\\p{Lower}\\p{Lower}\\p{Lower}\\d\\d\\d";
		
		System.out.println(s1 + "是合法数据吗? " + s1.matches(m1));
		System.out.println(s2 + "是合法数据吗? " + s2.matches(m1));
		
		// 简单判断邮箱的正则表达式
		String m2 = "\\w{0,}\\@\\w{0,}\\.{1}\\w{0,}";
		String s3 = "aaa@";
		String s4 = "aaaaaaaaa";
		String s5 = "aaaa@111.com";
		
		if (s3.matches(m2)) {
			System.out.println(s3  + "是一个E_mail地址格式");
		}else if (s4.matches(m2)) {
			System.out.println(s4  + "是一个E_mail地址格式");
		}else if (s5.matches(m2)) {
			System.out.println(s5  + "是一个E_mail地址格式");
		}else {
			System.out.println("都不是E_mail地址格式");
		}
	}
}
