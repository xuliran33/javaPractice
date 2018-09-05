import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

// Writer
// write(String)
// close();
// flush(); 清空缓存
// OutputStreamWriter: 可以指定编码格式
// 构造方法 OutputStreamWriter(OutputStream, String charSet)
// FileWrtiter
// 构造 FileWrtiter(File file) FileWrtiter(String path)

// 借助字符流向test.txt中写东西
// 借助字符输入流, 将文件内容读取出来显示在控制台
public class WriterDemo {
	public static void main(String[] args) {
		OutputStreamWriter out = null;
		BufferedWriter bw = null;
		FileOutputStream st = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			st = new FileOutputStream("test.txt", true);
			out = new OutputStreamWriter(st);
			bw = new BufferedWriter(out);
			bw.write("我是徐丽然");
			// 换行
			bw.newLine();
			bw.write("你好");
			bw.flush();
			
			fr = new FileReader("test.txt");
			br = new BufferedReader(fr);
			
			String temp = null;
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				bw.close();
				out.close();
				st.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
