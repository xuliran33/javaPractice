
public class Book {
	private int id;	// 定义一个int类型的成员变量id
	private String name; // 定义一个String类型的成员变量name
	private String category;	// 定义一个String类型的成员变量
	public String getName() {
		int id = 0;
		setName("Java");
		return id + this.name;
	}
	
	private void setName(String name) {	// 定义一个setName()方法
		this.name = name;				// 将参数值赋予类中的成员变量
	}
	
	public Book getBook() {
		return this;
	}	
}
