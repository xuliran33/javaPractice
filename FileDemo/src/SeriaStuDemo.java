import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 序列化和反序列化学生对象
// 常见异常 NotSerializableException
// 原因: 类没有实现Serializable接口
public class SeriaStuDemo {
	public static void main(String[] args) {
		Student stu = new Student("xiaohong", 18, "女", "123456");
		// 序列化
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		// 反序列化
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fos = new FileOutputStream("student.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(stu);
			oos.flush();
			
			fis = new FileInputStream("student.txt");
			ois = new ObjectInputStream(fis);
//			ArrayList<Student> arr = new ArrayList<Student>();
//		arr.addAll((ArrayList<Student>)ois.readObject());
//			for (Student stu1 : arr) {
			Student stu1 = (Student)ois.readObject(); 
				System.out.println(stu1.getName() + stu1.getAge() + stu1.getGender() + stu1.getPassword());
//			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
