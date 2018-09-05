import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
// FileReader是InputStreamReader的子类, FileReader是InputStreamReader的子类
// 用字符流读取文件
// 中文乱码原因: 文件编码格式与程序运行环境的编码格式不一致
// 解决方案: 字符流去读的时候, 指定字符流的编码格式
// FileReader无法指定编码格式, 会按照系统默认的编码格式去读
// InputStreamReader
// 构造方法1 InputStreamReader(InputStream)
// 构造方法2 InputStreamReader(InputStream, String charset) 指定字符编码格式


public class FileReaderDemo {
	public static void main(String[] args) {
		// 获取文件系统默认编码格式
		System.out.println(System.getProperty("file.encoding"));
		Reader fr = null;
		StringBuffer str = new StringBuffer();
		try {
//			fr = new FileReader("test2.rtf");
			FileInputStream fs = new FileInputStream("test2.rtf");
			fr = new InputStreamReader(fs, "utf-8");
			char[] ch = new char[1024];
			while (fr.read(ch) != -1) {
				str.append(ch);
			}
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
