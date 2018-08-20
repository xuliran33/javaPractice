package com.mingrisoft;

// 编写匿名内部类, 出去字符串中的全部空格
/**
 * 在图形化编辑的时间监控器代码中, 会大量使用匿名内部类, 这样可以大大简化代码, 并增强代码的可读性
 * */
public class OutString {
	public static void main(String[] args) {
		final String sourceStr = "吉林省 明日 科技有限公司-------编程  词典! ";
	IStringDeal s = new IStringDeal() {	// 编写匿名内部类
		@Override
		public String filterBlankChar() {
			String convertStr = sourceStr;
			convertStr = convertStr.replaceAll(" ", "");
			return convertStr;
		}
	};
	System.out.println("源字符串: " + sourceStr);
	System.out.println("转换后的字符串: " + s.filterBlankChar());
	}
}

