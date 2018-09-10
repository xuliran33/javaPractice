package com.xlr.threadsocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 服务器端, 监听客户请求, 一旦有客户请求, 创建一个新的线程, 并开启线程
// 获取客户端的IP地址InetAddress
public class LoginServer {
	public static void main(String[] args) {
		try {
			// 接收客户端请求
			// 创建服务器Socket, 需要端口号
			ServerSocket serverSocket = new ServerSocket(5000);
			// 使用accept()侦听并接收到ServerSocket的连接
			while(true) {
				Socket socket = serverSocket.accept();
				LoginThread th = new LoginThread(socket);
				th.start();
			}
			
			
//			socket.close();
//			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
