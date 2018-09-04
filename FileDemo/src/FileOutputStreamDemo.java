import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// 使用字节输出流向文件中写内容

// OutputStream常用方法
// void write(int c)
// void write(byte[] buf)
// void write(byte[] buf, int off, int len)
// void close()
// flush(): 强制将缓冲区清空
// FileOutputStream
// new FileOutputStream(File file) 覆盖原内容
// new FileOutputStream(String name) 覆盖原内容
// new FileOutputStream(String name, boolean append) append为true不会覆盖源文件内容, 追加内容, false则覆盖源文件
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("test.txt");
			String str = "好好学习java";
			//将字符串打散为一个字节数组
			byte[] word = str.getBytes();
			out.write(word, 0, word.length);
			System.out.println("文件已经被更新");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
