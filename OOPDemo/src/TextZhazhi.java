import java.util.Scanner;

// 榨汁机的测试类
public class TextZhazhi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ZhaZhiJi ji = new ZhaZhiJi();
		
		System.out.print("请输入水果:");
		String fruit = input.next();
		System.out.print("您想要几杯?");
		int num = input.nextInt();
		// 方法调用, 参数叫做实际参数, 也叫实参
		// 实参名字也可以随便取, 但是要符合驼峰命名规则, 同时也要有意义
		// 实参和形参的类型必须一致, 名字可以一致, 也可以不一致
		// 当参数传递为基本数据类型时, 方法内改变参数, 参数变化不保留, 基本数据类型传递的参数是数值
		// 当参数为引用数据类型(类, 数组, 接口)时, 方法内改变参数, 参数变化会保留, 引用数据类型传递的参数是地址
		System.out.println(ji.zhaZhi(num, fruit));
	}
}
