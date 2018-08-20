package com.mingrisoft;

public class TheSameName {
	// 内存中所有对象被放置在堆中, 将方法及方法中的形参或局部变量放置在栈中
	private int x;
	private class Inner {
		private int x = 9;
		public void doit(int x) {
			x++;		// 调用的是形参x
			this.x++;	// 调用内部类的变量x
			TheSameName.this.x++;	// 调用的是外部类的变量x	
		}
	}
}
