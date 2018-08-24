package com.xlr.animal;
// 主人类
public class Host {
	// 赠送动物: 将父类类型作为方法的返回值
	public Animal sendAnimal(String type) {
		Animal animal = null;
		if (type.equals("cat")) {
			animal = new Cat();
		}else if(type.equals("dog")) {
			animal = new Dog();
		}else {
			animal = new Dark();
		}
		
		return animal;
	}
}
