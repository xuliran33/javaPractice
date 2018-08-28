
public class Person {
	private String name;
	private String age;
	private String sex;
	
	// 输出个人信息
	public void print() {
		System.out.println(this.getName() + " " + this.getAge() + " " + this.getSex());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) throws Exception {
		if (sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		}else {
			throw new Exception("性别是男或女");
		}
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setSex("boy");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
