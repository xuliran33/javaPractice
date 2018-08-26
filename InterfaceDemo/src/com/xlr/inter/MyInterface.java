package com.xlr.inter;
// 接口 : 所有方法默认都是公共的抽象方法(public abstract)
// 接口所有的变量都是静态常量 (public static final)
// 接口不能被实例化, 没有构造方法
// 普通类必须实现接口的所有方法, 抽象类可以不实现接口方法
// 实现类可以实现多个接口	implements, 多个接口使用逗号隔开
// 接口不能实现接口, 但是可以继承多个其他接口

// 抽象类 vs 接口
// 相同点
// 代表系统的抽象层
// 都不能被实例化
// 都能包含抽象方法 用于描述系统提供的服务, 不必提供具体实现
// 不同点
// 在抽象类中可以为部分方法提供默认实现, 而接口中只能包含抽象方法
// 一个类只能继承一个直接的父类, 但是可以实现多个接口
// 已存在的继承树, 可以方便的抽取接口, 但是抽取抽象类并不容易
// 抽象类更容易扩展, 接口不能轻易添加抽象方法, 会影响所有的实现类
// java虚拟机不会和接口绑定(因为接口中都是抽象方法, 绑定没有意义, 会和具体的实现类绑定), 但是会和父类绑定, 所以只能继承一个父类, 可以实习多个接口

// 接口和抽象类的使用原则
// 接口做系统与外界交互的窗口: 接口提供服务
// 接口本身一旦制定, 就不允许随意修改
// 抽象类可完成部分功能的实现, 还有部分功能可作为系统的扩展点
public interface MyInterface {

}
