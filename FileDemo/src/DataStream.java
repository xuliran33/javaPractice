import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 二进制文件的读写
// DataOutputStream DataInputStream
// 吧star.jpc放到newPic文件夹中
public class DataStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		DataInputStream ds = null;
		FileOutputStream os = null;
		DataOutputStream dos = null;
		try {
			fs = new FileInputStream("star.jpg");
			ds = new DataInputStream(fs);
			os = new FileOutputStream("newPic/a.jpg");
			dos = new DataOutputStream(os);
			int temp = -1;
			while ((temp = ds.read()) != -1) {
				dos.write(temp);
				dos.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				os.close();
				ds.close();
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
