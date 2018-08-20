// 成员(全局)变量和局部变量
public class VarTest {
	// 成员变量与局部变量的区别
	// 作用域不同
	// 初始值不同: 成员变量默认初始值为0, null等, 局部变量会提示变量没有被初始化
	// 局部变量可以和全局变量重名, 使用的时候就近使用
	// 在不同的方法里可以有重名的局部变量, 在同一方法里不能有同名的局部变量
	
	// 成员属性(成员(全局)变量)
	int age;
	String name;
	
	// 成员方法
	public void method1() {
		int num = 1;
		System.out.println(num);
	}
	
	public void method2() {
		System.out.println(age);
	}
	
	public void method3() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
