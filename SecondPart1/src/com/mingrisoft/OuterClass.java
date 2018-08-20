package com.mingrisoft;

public class OuterClass {
	/**
	 * 成员内部类
	 * 在一个类中使用内部类可以在内部类中直接存取其所在类的私有成员变量
	 * 如果在外部类和非静态方法之外实例化内部类对象, 需要使用 "外部类.内部类" 的形式指定该对象的类型
	 * 内部类对象依赖于外部类对象, 除非已经存在一个外部类对象, 否则类中不会出现内部类对象
	 * */
	
	innerClass in = new innerClass();
	class innerClass {	// 声明内部类
		innerClass (){	// 内部类的构造方法
			
		}
		public void inf() {	// 内部类的成员方法
			
		}
		int y = 0;			// 定义内部类的成员变量
	}
	
	public innerClass doit() {	// 外部类方法, 返回值为内部类引用
		in.y = 4;				
		return new innerClass();		// 返回内部类引用
	}
	
	public static void main(String args[]) {
		OuterClass out = new OuterClass();
		// 内部类的对象实例化操作必须在外部类或外部类中的非静态方法中实现
		OuterClass.innerClass in = out.doit();
		OuterClass.innerClass in2 = out.new innerClass();	// 实例化内部类对象, 在实例化内部类对象时, 不能再 new 操作符之前使用外部类名称那种形式, 而应该使用外部类的对象来创建其内部类的对象
	}

}
