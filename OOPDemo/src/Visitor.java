// 游人类
public class Visitor {
	// 属性 姓名
	String name;
	// 属性 年龄
	int age;
	
	// 计算价格方法
	public void getPrice() {
		if (age <= 10) {
			System.out.println("门票免费!");
		}else if (age >= 60) {
			System.out.println("门票半价: 10元");
		}else {
			System.out.println("没有优惠, 门票: 20元");
		}
	}
	
}
