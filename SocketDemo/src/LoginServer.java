import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 服务器端
public class LoginServer {
	public static void main(String[] args) {
		try {
			// 接收客户端请求
			// 创建服务器Socket, 需要端口号
			ServerSocket serverSocket = new ServerSocket(5000);
			// 使用accept()侦听并接收到ServerSocket的连接
			Socket socket = serverSocket.accept();
			// 通过输入流, 获得用户的请求
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info;
			while((info = br.readLine()) != null) {
				System.out.println("客户端说:" + info);
			}
			
			// 给客户端一个响应
			String reply = "欢迎登陆";
			// 通过输出流将响应发回给客户端
			OutputStream os = socket.getOutputStream();
			byte[] replys = reply.getBytes();
			os.write(replys);
			
			// 释放资源
			os.close();
			br.close();
			is.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
