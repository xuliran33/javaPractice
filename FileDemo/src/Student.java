import java.io.Serializable;

// 学生类
// transient 屏蔽某些敏感字段的序列化
public class Student implements Serializable{
	private String name;
	private int age;
	private String gender;
	private transient String password;
	
	
	public Student(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	public Student(String name, int age, String gender, String password) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
