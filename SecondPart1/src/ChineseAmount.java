import java.util.regex.Pattern;

public class ChineseAmount {
	public static void main(String[] args) {
		String text = "明日科技 soft";
		int amount = 0;
		for (int i = 0; i < text.length(); i++) {
			boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$", "" + text.charAt(i));	// 使用正则表达式判断字符是否属于汉字编码
			if (matches) {
				amount++;
			}
		}
		System.out.println("明日科技 soft 中有" + amount + "个汉字");
	}
}
