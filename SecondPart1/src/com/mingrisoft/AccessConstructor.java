package com.mingrisoft;

import java.lang.reflect.Constructor;

public class AccessConstructor {
	public static void main(String[] args) {
		Constructor[] declaredConstructor = MoreConstructor.class.getDeclaredConstructors();	// 获得所有的构造方法
		for (int i = 0; i < declaredConstructor.length; i++) {
			Constructor constructor = declaredConstructor[i];	// 遍历构造方法
			System.out.println("查看是否允许带有可变数量的参数: " + constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次为: ");
			Class[] parameterTypes = constructor.getParameterTypes();	// 获得所有参数类型
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" " + parameterTypes[j]);
			}
			
			System.out.println("该构造方法可能抛出的异常类型为: ");
			// 获得所有可能抛出的异常信息类型
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}
			
			MoreConstructor example2 = null;
			while (example2 == null) {
				// 如果该成员变量的访问权限为private, 则抛出异常, 即不允许访问
				try {
					if (i == 0) {
						// 通过执行默认没有参数的构造方法创建对象
						example2 = (MoreConstructor)constructor.newInstance();
					} else if(i == 1) {
						// 通过执行具有两个参数的构造方法创建对象
						example2 = (MoreConstructor)constructor.newInstance("7", 5);
					} else {
						// 通过执行具有可变数量参数的构造方法创建对象
						Object[] parameters = new Object[] {new String[] {"100", "200", "300"}};
						example2 = (MoreConstructor)constructor.newInstance(parameters);
					}
				} catch (Exception e) {
					System.out.println("在创建对象时抛出异常, 下面执行setAccessible()方法");
					constructor.setAccessible(true);// 设置为允许访问
				}
			}
			example2.print();
			System.out.println();
		}
	}
	

}
