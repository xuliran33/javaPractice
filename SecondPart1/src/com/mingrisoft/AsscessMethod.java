package com.mingrisoft;

import java.lang.reflect.Method;

public class AsscessMethod {
	public static void main(String[] args) {
		Method[] declaredMethod = MoreMethod.class.getDeclaredMethods();	// 获得所有方法
		MoreMethod name = new MoreMethod();						// 实例化变量
		for (int i = 0; i < declaredMethod.length; i++) {		// 遍历方法
			Method method = declaredMethod[i];
			System.out.println("名称为: " + method.getName()); 	// 获得方法名称
			System.out.println("是否允许带有可变数量的参数: " + method.isVarArgs());
			System.out.println("入口参数类型依次为: ");
			Class[] parameterTypes = method.getParameterTypes();		// 获得所有参数类型
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.println(" " + parameterTypes[j]);
			}
			System.out.println("返回值类型为: " + method.getReturnType());		//获得方法返回值类型
			System.out.println("可能抛出的异常类型有: ");
			// 获得方法可能抛出的所有异常类型
			Class[] exceptionTypes = method.getExceptionTypes();	
			for (int j = 0; j < exceptionTypes.length; j++) {
				System.out.println(" " + exceptionTypes[j]);
			}
			
			boolean isTurn = true;
			while (isTurn) {
				try {
					isTurn = false;
					if (i == 0) {
						method.invoke(name);		// 执行没有入口参数的方法
					} else if (i == 1) {
						System.out.println("返回值为: " + method.invoke(168));	// 执行方法
					} else if (i == 2) {
						System.out.println("返回值为: " + method.invoke(name, "7", 5)); // 执行方法
					} else {
						Object[] parameters = new Object[] {new String[] {"M", "W", "Q"}};// 定义二维数组
						System.out.println("返回值为: " + method.invoke(name, parameters));
					}
				} catch (Exception e) {
					System.out.println("在执行方法时抛出异常, 下面执行setAccessible() 方法!");
					method.setAccessible(true);
					isTurn = true;
				}
			}
			
		}
	}
}
