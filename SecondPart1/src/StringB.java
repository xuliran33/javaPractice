
public class StringB {
	public static void main(String[] args) {
		// 验证字符串是否回文
		String str1 = "这首(咏雪)";
		StringBuilder str2 = new StringBuilder(str1);
		str2.reverse();	// 在字符串生成器中将字符串反转
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				System.out.println("str1 不是回文诗");
				break;
			}else {
				count++;
			}
		}
		if (count == str1.length()) {
			System.out.println("str1是回文诗");
		}
	}
}
