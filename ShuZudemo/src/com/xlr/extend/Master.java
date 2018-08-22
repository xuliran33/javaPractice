package com.xlr.extend;
// 主人类
// 多态: 同一个引用类型, 使用不同的实例而执行不同的操作
public class Master {
	// 为宠物看病
//	// 为狗狗看病
//	public void cure(Dog dog) {
//		if (dog.getHealth() < 50) {
//			System.out.println("打针,吃药");
//			dog.setHealth(60);
//		}
//	}
//	// 为企鹅看病
	public void cure(Pet pet) {
		pet.toHospital();
	}
}
