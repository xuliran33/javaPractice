package com.xlr.goods;

public class Test {
	public static void main(String[] args) {
		Goods goods = Factory.getGood("TV");
		goods.printPrice();
	}
}
