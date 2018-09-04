import java.io.File;
import java.io.IOException;

// 文件操作: 文件不存在, 创建文件, 文件存在, 查询文件信息, 删除文件

public class FileDemo {
	public static void main(String[] args) {
		FileDemo fd = new FileDemo();
		File file = new File("test.txt");
		fd.create(file);
//		fd.showFileInfo(file);
//		fd.delete(file);
	}
	
	// 删除文件
	public void delete(File file) {
		if (file.exists()) {
			file.delete();
			System.out.println("文件已删除");
		}
	}
	
	// 查看文件相关信息的方法
	public void showFileInfo(File file) {
		if (file.exists()) {
			if (file.isFile()) {
				// 是文件
				System.out.println("该文件名: " + file.getName());
				System.out.println("该文相对路径: " + file.getPath());
				System.out.println("该文绝对路径: " + file.getAbsolutePath());
				System.out.println("该文大小: " + file.length());
			}else if(file.isDirectory()) {
				System.out.println("此路径下的文件是目录");
			}
		}else {
			System.out.println("文件不存在");
		}
	}
	
	// 创建文件
	public void create(File file) {
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("文件已经创建");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("文件已存在");
		}
	}
}
