
public class ModifyStudent {
	public void modifyScore(Student[] stus) {
		for (int i = 0; i < stus.length; i++) {
			Student student = stus[i];
			if (student.score < 60) {
				student.score += 2;
			}
		}
	}
	
	public void showInfo(Student[] stus) {
		for (Student student : stus) {
			student.showStudent();
		}
	}
	
	public static void main(String[] args) {
		ModifyStudent ms = new ModifyStudent();
		Student[] stus = new Student[3];
		
		Student stu1 = new Student();
		stu1.name = "张三";
		stu1.score = 40;
		
		Student stu2 = new Student();
		stu2.name = "李四";
		stu2.score = 90;
		
		Student stu3 = new Student();
		stu3.name = "王五";
		stu3.score = 50;
		
		stus[0] = stu1;
		stus[1] = stu2;
		stus[2] = stu3;
		
		ms.modifyScore(stus);
		ms.showInfo(stus);
	}
}
