import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

// 用字符流读取文件
public class PetReaderDemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		InputStreamReader sr = null;
		FileInputStream fs = null;
		try {
			fs = new FileInputStream("pet.template");
			sr = new InputStreamReader(fs);
			br = new BufferedReader(sr);
			StringBuffer str = new StringBuffer();
			String temp = null;
			while ((temp = br.readLine()) != null) {
				str.append(temp);
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
				sr.close();
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
