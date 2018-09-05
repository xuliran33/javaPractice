import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// 用字符流读取文件
public class PetReaderDemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		InputStreamReader sr = null;
		FileInputStream fs = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
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
//			str.replace(str.indexOf("{name}"), str.indexOf("{name}") + "{name}".length(), "wangwang");
//			str.replace(str.indexOf("{type}"), str.indexOf("{type}") + "{type}".length(), "狗狗");
//			str.replace(str.indexOf("{master}"), str.indexOf("{master}") + "{master}".length(), "徐丽然");
//			String newStr1 = str.toString().replace("{name}", "wangwang");
//			String newStr2 = newStr1.replace("{type}", "狗狗");
//			String newStr = newStr2.replace("{master}", "孔");
			String newStr = str.toString().replace("{name}", "wangwang").replace("{type}", "狗狗").replace("{master}", "孔");
			System.out.println(newStr);
			// 写入内容
			fw = new FileWriter("text.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(newStr);
			
			bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
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
