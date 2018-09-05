import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// 缓冲流: BufferedReader
// readLine
public class BufferedReaderDemo {
	public static void main(String[] args) {
		// 获取文件系统默认编码格式
		System.out.println(System.getProperty("file.encoding"));
		Reader fr = null;
		BufferedReader br = null;
		FileInputStream fs = null;
		StringBuffer str = new StringBuffer();
		try {
			fs = new FileInputStream("test.txt");
			fr = new InputStreamReader(fs, "utf-8");
			br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {
				str.append(s);
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
				br.close();
				fr.close();
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
