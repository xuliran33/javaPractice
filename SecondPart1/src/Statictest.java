
public class Statictest {
	/**
	 * 静态变量, 常量和方法
	 * 由static修饰的变量, 常量和方法被称作静态变量, 常量和方法
	 * 在静态方法中不可以使用this关键字
	 * 在静态方法中不可以直接调用非静态方法
	 * 不能将局部变量声明为static
	 * */ 
	
	/**
	 * 权限修饰符
	 * private -- 该成员变量只能在本类中被使用, 在子类中是不可见的, 并且对其他包的类也是不可见的
	 * public -- 除了在本类中使用这些数据之外, 还可以在子类和其他包中的类中使用
	 * protected -- 只有本包内该类的子类或其他类可以访问此类的成员变量和成员方法
	 * 当生命类时不使用public, protected, private修饰符这只类的权限, 则这个类预设为包存取范围, 即只有一个包中的类可以调用这个类的成员变量或成员方法
	 * */
	static double PI = 3.1415;	// 在类中定义静态常量
	static int id;	// 在类中定义静态变量
	
	public static void method1() {	// 在类中定义静态方法
		// 方法体
	}
	
	public void method2() {					// 在类中定义一个非静态方法
		System.out.println(Statictest.PI);	// 调用静态常量
		System.out.println(Statictest.id);	// 调用静态变量
		Statictest.method1();	// 调用静态方法
	}
	
/**
 * public static StaticTest method3() {		// 不能在静态方法中调用非静态方法和this关键字, 不能将方法体内部的局部变量声明为static, 
		 method2();		
		 return this;
	}

 * 
 * 如果在执行类时, 希望先执行类的初始化动作, 可以使用static定义一个静态区域
 * public class example{
 * 	static{
 *	// 当代码被执行时, 首先执行static块中的程序, 并且只会执行一次
 * }
 * }
 * */
}
