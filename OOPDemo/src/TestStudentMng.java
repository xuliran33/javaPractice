import java.util.Scanner;

public class TestStudentMng {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentMng student = new StudentMng();
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入学员姓名: ");
			student.addStudent(input.next());
		}
		
		student.showStudent();
		
		System.out.print("请输入查找的开始位置:");
		int start = input.nextInt();
		
		System.out.print("请输入查找的结束位置:");
		int end = input.nextInt();
		
		System.out.print("请输入查找的学员姓名:");
		String name = input.next();
		
		if(student.findStudent(start, end, name)) {
			System.out.println("找到学员");
		}else {
			System.out.println("没有找到学员");
		}
	}
}
