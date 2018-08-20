import java.util.Date;
import java.util.Locale;

public class FormatString {
	public static void main(String args[]) {
		// 日期格式化
		Date today = new Date();
		String a = String.format(Locale.US, "%tb", today);
		String b = String.format(Locale.US, "%tb", today);
		String c = String.format("%ta", today);
		String d = String.format("%tA", today);
		String e = String.format("%tY", today);
		String f = String.format("%ty", today);
		String g = String.format("%tm", today);
		String h = String.format("%td", today);
		String i = String.format("%te", today);
		
		System.out.println("格式化后的字符串为月份的英文缩写: " + a);
		System.out.println("格式化后的字符串为月份的英文全写: " + b);
		System.out.println("月格式化后的字符串为星期: " + c);
		System.out.println("格式化后的字符串为星期: " + d);
		System.out.println("格式化后的字符串为4位的年份值: " + e);
		System.out.println("格式化后的字符串为2位的年份值: " + f);
		System.out.println("格式化后的字符串为2位的月份值: " + g);
		System.out.println("格式化后的字符串为2位的日期值: " + h);
		System.out.println("格式化后的字符串为1位的日期值: " + i);
		
		System.out.println("默认时间格式: " + today);
		System.out.println("两位24小时制的小时" + String.format("%tH", today));
		System.out.println("两位12小时制的小时" + String.format("%tI", today));
		System.out.println("24小时制的小时" + String.format("%tk", today));
		System.out.println("12小时制的小时" + String.format("%tl", today));
		System.out.println("两位数字的分钟" + String.format("%tM", today));
		System.out.println("两位数字的秒: " + String.format("%tS", today));
		System.out.println("表示时区缩写形式的字符串: " + String.format("%tZ", today));
		System.out.println("上午还是下午" + String.format("%tp", today));
		
		// 格式化时间和日期
		System.out.println("24小时制的时间, 被格式化为小时和分钟: " + String.format("%tR", today));
		System.out.println("24小时制的时间, 被格式化为小时, 分钟和秒: " + String.format("%tT", today));
		System.out.println("12小时制的时间, 被格式化为: " + String.format("%tr", today));
		System.out.println("日期被格式化为: " + String.format("%tD", today));
		System.out.println("ISO 8601 格式的完整日期, 被格式化为: " + String.format("%tF", today));
		System.out.println("日期和时间被格式化为" + String.format("%tc", today));
		
		System.out.println("400 的一半是: " + String.format("%d", 400 / 2));	// 将结果已十进制显示
		System.out.println("3 > 5正确吗: " + String.format("%b", 3 > 5));		// 将结果以布尔形式显示
		System.out.println("200的十六进制数是: " + String.format("%x", 200));
	}
}
