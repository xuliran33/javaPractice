package com.xlr.threadsocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

// 客户端
public class LoginClient3 {
	public static void main(String[] args) {
		try {
			// 创建客户端的socket
			// 发送请求到服务器
			Socket socket = new Socket("localhost", 5000);
			// 通过输出流发送请求
			User user = new User("LiLy", "123456");
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(user);
			
			// 接收服务器的响应
			// 关闭输出流
			socket.shutdownOutput();
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String reply = null;
			while ((reply = br.readLine()) != null) {
				System.out.println("收到响应: " + reply);
			}
			
			// 释放资源
			br.close();
			is.close();
			oos.close();
			os.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
