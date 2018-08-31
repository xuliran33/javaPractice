package com.xlr.common;
// 包装类把基本数据类型转换为对象
// 每个基本类型在java.lang包中都有一个相应的包装类
// 包装类的作用 : 提供一些列实用的方法  集合不允许存放基本数据类型数据, 存放数字时, 要用包装类型
// boolean -> Boolean char -> Character byte -> Byte short -> Short int -> Integer long -> Long float -> Float, double -> Double  (Byte, Short, Integer, Long, Float, Double继承自Number, Boolean, Number, Character 继承自Object)

// 包装类的构造方法
// 所有包装类都可以将之与对应的基本数据类型作为参数, 来构造它们的实例 public Type(type value)
// 除Character外, 其他包装类可将一个字符串作为参数构造它们的实例, public Type(String value)

// 包装类转换为基本类型 xxxValue();
public class Test {
	public static void main(String[] args) {
		// 构造方法
		// 所有包装类都有的构造方法, 将与之对应的基本数据类型作为参数
		Integer i = new Integer(1);
		Double d = new Double(1);
		Boolean b = new Boolean(true);
		Character c = new Character('a');
		System.out.println(i + "\t" + d + "\t" + b + "\t" + c);
		System.out.println(i.intValue() + "\t" + d.doubleValue() + "\t" + b.booleanValue() + "\t" + c.charValue());
		// 除Character都有的构造方法, 将字符串作为参数, 字符串不能为null, 并且字符串应为能改变为对应类型的字符串; 是Boolean类型时, 只要字符串是"true"不区分大小写, 结果均为true, 其他均为false;
		Integer i1 = new Integer("1");
		Double d1 = new Double("1");
		Boolean b1 = new Boolean("true");
		System.out.println(i1 + "\t" + d1 + "\t" + b1 + "\t");
		
		// 把基本类型变成字符串 
		String itos = Integer.toString(9);
		String itos1 = 9 + "";
		
		// 字符串 -> 基本数据类型 parseXXX, Character除外
		int stoi = Integer.parseInt(itos);
		boolean bool = Boolean.parseBoolean("true");
		
		// valueOf(): 基本类型 -> 包装类, 除Character 字符串 -> 包装类
		
		Integer i2 = Integer.valueOf(100);
		Double d2 = Double.valueOf(80.1);
		Boolean b2 = Boolean.valueOf(true);
		Character c2 = Character.valueOf('c');
		System.out.println(i2 + "\t" + d2 + "\t" + b2 + "\t" + c2);
		
		Integer i3 = Integer.valueOf("100");
		Double d3 = Double.valueOf("80.1");
		Boolean b3 = Boolean.valueOf("true");
		System.out.println(i3 + "\t" + d3 + "\t" + b3);
		
		// 装箱拆箱
		// 装箱: 基本类型转换为包装类的对象
		// 拆箱: 将包装类转换为基本类型的值
		
		// Math 数学运算
		Math.random(); // 生成0-1之间的浮点数 0=< x < 1
		int rand1 = (int)Math.random() * 10; // 0 - 9 (包含9)
	}
}
