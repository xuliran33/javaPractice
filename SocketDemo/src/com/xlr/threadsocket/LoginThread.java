package com.xlr.threadsocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LoginThread extends Thread {
	private Socket socket;

	public LoginThread(Socket socket) {
		super();
		this.socket = socket;
	}

	public void run() {
		super.run();
		// 获得socket请求, 并返回响应
		try {
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			User user = (User)ois.readObject();
			System.out.println("收到客户端信息: " + user.getUserName() + user.getPwd());
			// 获得客户端的信息
			System.out.println("客户端地址" +  socket.getInetAddress().getHostAddress());
			// 给客户端一个响应
			String reply = user.getUserName() + "欢迎登陆";
			// 通过输出流将响应发回给客户端
			OutputStream os = socket.getOutputStream();
			byte[] replys = reply.getBytes();
			os.write(replys);

			// 释放资源
			os.close();
			ois.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
