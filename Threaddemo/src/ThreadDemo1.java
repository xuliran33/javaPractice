// Thread类
// java提供了java.lang.Thread类支持多线程编程
// 主线程
// main() 方法即为主线程的入口
// 产生其他子线程的线程
// 必须最后完成执行, 因为它执行各种关闭动作
public class ThreadDemo1 {
	public static void main(String[] args) {
		// 获取主线程对象
		Thread t = Thread.currentThread();
		System.out.println("当前线程是: " + t.getName());
		// 更改线程名称
		t.setName("MyJavaThread");
		System.out.println("当前线程是: " + t.getName());
	}
}
