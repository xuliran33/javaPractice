
public class Student {
	String name;
	double score;
	// 一个类中允许出现多个同名不同参的方法, 叫做方法的重载, 与返回值和访问修饰符无关
	
	// 构造方法
	// (1) 该方法没有(缺少)返回值
	// (2) 该方法名字必须和类名一样
	// (3) 每个类中都有一个默认无参构造方法, 但是, 一旦添加了带参的构造方法, 那么系统默认的无参构造方法就被覆盖掉了, 若想使用, 必须显示的写出来
	// 无参构造方法
	public Student() {
		
	}
	// 带参构造方法
	public Student(String name, int score) {
		// this 是什么? this 是当前对象
		this.name = name;
		this.score = score;
	}
	
	public void showInfo() {
		System.out.println("姓名: " + name + "分数: " + score);
	}
}
