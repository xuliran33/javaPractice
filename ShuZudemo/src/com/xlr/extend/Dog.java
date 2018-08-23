package com.xlr.extend;
/**
 * super, 代表父类对象
 * 访问父类构造方法 super(), super(name), 在子类构造方法中调用, 且必须是第一句调用
 * 访问父类属性和方法, 不可以访问父类private的属性和方法
 * 继承条件西构造方法的调用规则
 * 子类构造方法没有通过super显式调用父类的有参构造方法, 也没有通过this显示调用自身其他构造方法, 系统默认调用父类的无参构造方法
 * 子类构造方法通过super显示调用父类的有参构造方法, 执行父类相应构造方法, 而不执行父类无参构造方法
 * 子类构造方法通过this显示调用自身的其他构造方法, 在相应构造方法中应用以上两条规则
 * 单继承 java类只能有一个直接父类, 一个类可以有多个间接父类, 调用间接父类的方法, 使用super.即可
 * */
public class Dog extends Pet {
	
	
	public Dog(String name, int age, int health) {
		super(name, age);
		this.setHealth(health);
	}
	

	
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("健康值" + this.getHealth());
	}
	
	@Override
	public void toHospital() {

		if (this.getHealth() < 50) {
			System.out.println("打针,吃药");
			this.setHealth(60);
		}
	}
	
	@Override
	public void eat() {
		System.out.println("吃根骨头");
		this.setHealth((this.getHealth() + 3) > 100 ? 100 : (this.getHealth() + 3));
		
	}
}
