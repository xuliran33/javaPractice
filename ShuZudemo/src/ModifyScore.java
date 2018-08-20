import java.util.Scanner;

public class ModifyScore {
	// 分数加2
	public void modifyScore(Student[] stus) {
		for (int i = 0; i < stus.length; i++) {
			Student student = stus[i];
			if (student.score < 60) {
				student.score += 2;
			}
		}
	}
	// 显示信息
	public void showInfo(Student[] stus) {
		for (int i = 0; i < stus.length; i++) {
			Student student = stus[i];
			student.showInfo();
		}
	}
	// 主方法
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[] stus = new Student[3];
		ModifyScore ms = new ModifyScore();
		
//		Student stu1 = new Student();
//		stu1.name = "Tom";
//		stu1.score = 40;
		Student stu1 = new Student("Tom", 40);
//		Student stu2 = new Student();
//		stu2.name = "Lisa";
//		stu2.score = 90;
		Student stu2 = new Student("Lisa", 90);
//		Student stu3 = new Student();
//		stu3.name = "Wendy";
//		stu3.score = 59;
		Student stu3 = new Student("Wendy", 59);
		
		stus[0] = stu1;
		stus[1] = stu2;
		stus[2] = stu3;
		
		ms.modifyScore(stus);
		ms.showInfo(stus);
	}
}
