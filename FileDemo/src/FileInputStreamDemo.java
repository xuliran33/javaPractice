import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 读取文件 test.txt

// InputStream 抽象类(字节输入流) --> 学习实现类 FileInputStream
// 常用方法
// int read()--> 一个字节一个字节的读取数据, 返回该字节的整数表示形式int类型
// int read(byte[] b) --> 从输入流读取若干字节, 把这些字节保存到数组b中, 返回的是读取到的字节数, 若果到了输入流的末尾, 方法返回 -1
// int read(byte[]b, int off, int len) --> 从输入流读取若干字节, 把这些字节保存到数组b中, 返回的是读取到的字节数, 若果到了输入流的末尾, 方法返回 -1, off指的是字节数组中开始保存数据的起始下标, len指读取的字节数目
// void close() --> 关闭字节输入流
// int available() --> 可以从输入流中读取的字节数目
// 子类 FileInputStream常用构造方法
// FileInputStream(File file) --> 参数文件
// FileInputStream(String name) --> 参数路径

public class FileInputStreamDemo {
	public static void main(String[] args) {
		// 输入流
		FileInputStream input = null;
		try {
			input = new FileInputStream("test.txt");
			System.out.println("可以读取到的字节数" + input.available());
//			 借助输入流的read()方法读文件
			int data;
			while ((data = input.read()) != -1) {
				System.out.print((char)data);
			}	
			
//			byte[] b = new byte[1024];
//			int data;
//			while ((data = input.read(b)) != -1) {
//				for (int i = 0; i < data; i++) {
//					byte c = b[i];
//					System.out.print((char)c);
//				}
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
