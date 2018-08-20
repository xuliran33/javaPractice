// 人类: 自定义数据类型 ->>>根据类去创建对象
public class Ren {
	// 属性(特征): 成员变量
	// 姓名 年龄 性别
	String name;
	int age;
	char sex;
	
	// 方法(行为): 成员方法
	// 自我介绍
	/*public String showInfo() {
		String info = "我叫" + name + ";" + age + "岁;" + sex;
		// return 作用 (1) 返回值 (2) 代表方法结束
		return info;
	}*/
	
	public void showInfo() {
		String info = "我叫" + name + ";" + age + "岁;" + sex;
		sayHello();
		System.out.println(info);
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
}
