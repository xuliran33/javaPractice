// 测试人类的, 创建人类的对象
public class TestRen {
	public static void main(String[] args) {
		// 创建对象: 类名  对象名 = new 类名()
		Ren ren1 = new Ren();
		// 使用对象的属性和方法: 对象名.属性   对象名.方法名
		ren1.name = "张三";
		ren1.age = 18;
		ren1.sex = '男';
		
		ren1.showInfo();
//		System.out.println(ren1.showInfo());
		
	}
}
