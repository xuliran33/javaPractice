
public class Person {
	private String name;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeException{
		if (age > 0 && age <= 100) {
			this.age = age;
		}else {
			throw new AgeException("年龄异常");
		}
		
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
		
		try {
			p.setAge(100);
		} catch (AgeException e) {
			e.printStackTrace();
		}
		
	}
	
}
