import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 复制文件, 需要将test.txt文件的内容复制到test1.txt中
public class InoutAndOutputDemo {
	public static void main(String[] args) {
		// 检查test1.txt是否存在
		File fd = new File("test1.txt");
		if (!fd.exists()) {
			try {
				fd.createNewFile();
				System.out.println("创建文件成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 读取test文件中的内容
		FileInputStream input = null;
		FileOutputStream output = null;
		byte[] b = new byte[1024];
		
		try {
			input = new FileInputStream("test.txt");
			output = new FileOutputStream("test1.txt", true);
			int data = -1;
			while ((data = input.read(b)) != - 1) {
				output.write(b, 0, data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 流的关闭: 先打开的后管, 后打开的先关
				output.close();
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
