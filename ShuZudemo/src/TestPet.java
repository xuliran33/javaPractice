import com.xlr.oop.Dog;
// 访问权限修饰符 public private protected 默认
// 类的访问修饰符 public(公有访问级别) 默认(包级私有, 只有本包内的类可以访问)
// private 修饰的成员, 只有在同类中被访问
// 默认修饰符 修饰的成员, 在同一个类, 同一个包中可以被访问, 其他地方不能访问
// protected 修饰的成员, 可以在同一个类, 同一个包, 及子类中被访问
// public修饰的成员, 在任何地方都可以访问

// static 修饰符 -- 静态 可修饰方法(静态方法, 通过类名访问), 变量(静态变量, 通过类名访问), 代码块(静态代码块, java虚拟机加载类时, 就会执行该代码块)

public class TestPet {
	// 变量可分为静态变量(被static修饰, 在方法中不能定义静态变量, 可以被类名直接调用, 在内存中只有一个拷贝, 在类内部, 可在任何方法内直接访问, 在其他类中可通过类名访问) 实例变量(没有static修饰, 必须通过实例调用)
	public int age;
	public static String email;
	// 方法: 静态方法(static修饰, 可以通过类名访问, 可以直接访问静态变量, 静态方法, 不能直接访问实例变量, 实例方法, 静态方法不能用this和super; 静态方法必须被实现, 不能是抽象的) 实例方法(可以直接访问静态方法,静态变量, 实例变量, 实例方法)
	public static void main(String[] args) {
		
		// 用同名不同包中的类
//		com.xlr.oop.Dog dog = new com.xlr.oop.Dog();
//		Dog dog2 = new Dog();
		
		// 普通包的引入
		Dog dog = new Dog();
//		dog.setHealth(-1000);
	}

}
