package com.xlr.rentmanager;

public abstract class CarManager {
	public abstract void rent();
	
	// 判断输入的编号是否正确
	public boolean noReal(int no, Object[] arr) {
		if (!(no > 0 && no < arr.length)) {
			System.out.println("输入错误");
			return false;
		}
		return true;
	}
}
