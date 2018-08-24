package com.xlr.goods;
// 工厂类: 根据用户提供的条件, 返回相应商品
// 简单工厂模式
public class Factory {
	public static Goods getGood(String type) {
		Goods goods = null;
		if (type.equals("TV")) {
			goods = new Tvs();
		}else {
			goods = new Foods();
		}
		return goods;
	}
}
