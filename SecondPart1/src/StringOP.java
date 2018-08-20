import java.util.StringTokenizer;

public class StringOP {
	public static void main(String[] args) {
		// 1 用String()方法初始化一个新创建的String对象
		String s1 = new String();
		// 2 用一个字符数组 a 创建String对象
		char a[] = {'g', 'o', 'o', 'd'};
		String s2 = new String(a);
		// 3 截取数组的一部分创建一个字符串对象
		String s3 = new String(a, 2, 2);
		
		String s4 = new String("hello");
		String s5 = new String("word");
		
		String s6 = s4 + " " + s5;
		
		int bookTime = 4;
		float practice = 2.5f;
		System.out.println("我每天花费" + bookTime + "小时看书: " + practice + "小时上机练习");
		
		System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s6);
		
		// 获取字符串的长度
		System.out.println("字符串的长度是" + s6.length());
		
		// 获取指定字符的索引位置
		System.out.println("字符 o 在字符串s6中的位置是" + s6.indexOf('o'));
		System.out.println("字符串 el 在字符串 s6 中的指定位置是" + s6.indexOf("el"));
		
		// 获取字符串最后出现的位置, 如果没有, 返回 - 1
		System.out.println("字符 s 在字符串中最后出现的位置是 " + s6.lastIndexOf('s'));
		
		// 获取指定索引位置的字符串
		System.out.println("字符串 s6 中索引位置是 6 的字符为" + s6.charAt(6));
		
		// 去除字符串中的空格
		// 去除字符串的前导, 尾部的空格
		String s7 = "      Java  class    ";
		String s8 = s7.trim();
		System.out.println("字符串原来的长度为: " + s7.length());
		System.out.println("字符串去除空格之后的长度为: " + s8.length());
		System.out.println("去除字符串之后的字符串是: " + s8);
		
		// 去除字符串中指定字符串
		// StringTokenizer()方法切割字符串
		StringTokenizer st = new StringTokenizer(s8, " ");	// 使用空格来分割字符串
		StringBuffer sb = new StringBuffer();	// 定义字符串缓存对象
		while (st.hasMoreTokens()) {		// 判断字符串中是否还有空格
			sb.append(st.nextToken());
		}
		System.out.println("去掉字符串中所有空格之后的字符串是: ");
		System.out.println(sb.toString());
		
		// replaceAll 替换所有字符串
		String s9 = "J a v  a 编程字典";
		s9 = s9.replaceAll(" ", "");
		System.out.println("去除空格后的字符串为: " + s9);
		
		// 字符串替换
		String s10 = "bad bad study";
		String s11 = s10.replace("bad", "good");
		System.out.println("替换后的字符串是: " + s11);
		
		// 替换第一个出现的指定字符串
		String s12 = s10.replaceFirst("bad", "good");
		System.out.println("替换后的字符串是: " + s12);
		
		String s13 = new String("I am a student");
		String s14 = new String("I am a student");
		String s15 = new String("I AM A STUDENT");
		String s16 = s13;
		// 区分大小写判断字符串是否相等equals
		// 不区分大小写判断字符串是否相等equalsIgnoreCase
		
		boolean b1 = (s13 == s14);	// 比较内存位置
		boolean b2 = (s13 == s16);
		boolean b3 = s13.equals(s14);	// 比较字符串实际值
		boolean b4 = s13.equals(s15);
		boolean b5 = s13.equalsIgnoreCase(s14);
		boolean b6 = s13.equalsIgnoreCase(s15);
		
		System.out.println("s13 == s14: " + b1);
		System.out.println("s13 == s16: " + b2);
		System.out.println("s13.equals(s14) : " + b3);
		System.out.println("s13.equals(s15) : " + b4);
		System.out.println("s13.equalsIgnoreCase(s14)" + b5);
		System.out.println("s13.equalsIgnoreCase(s15)" + b6);
		
		// 判断字符串的开始(startsWith)与结尾(endsWith)
		String num1 = "22045612";
		String num2 = "21304578";
		
		boolean b7 = num1.startsWith("22");
		boolean b8 = num1.endsWith("78");
		boolean b9 = num2.startsWith("22");
		boolean b10 = num2.endsWith("78");
		
		// 输出信息
		System.out.println("字符串num1是以'22'开始的吗? " + b7);
		System.out.println("字符串num1是以'78'结束的吗? " + b8);
		System.out.println("字符串num2是以'22'开始的吗? " + b9);
		System.out.println("字符串num2是以'78'结束的吗? " + b10);
		
		String s17 = new String("abc DEF");
		
		System.out.println("全部转换成小写字母后的字符串是: " + s17.toLowerCase());
		System.out.println("全部转换成大写字母后的字符串是: " + s17.toUpperCase());
		
		// 分割字符串
		// 多个分隔符 x|x|x
		String s18 = new String("abc,def,ghi,jkl");
		String[] news1 = s18.split(",");
		System.out.println("按分割字符串分割后的字符串是: ");
		for (int j = 0; j < news1.length; j++) {
			System.out.println(news1[j]);
		}
		System.out.println();
		
		String news2[] = s18.split(",", 3);
		System.out.println("按分隔符分割一次后的字符串是: ");
		for (int j = 0; j < news2.length; j++) {
			System.out.println(news2[j]);
		}
		
	}
}
