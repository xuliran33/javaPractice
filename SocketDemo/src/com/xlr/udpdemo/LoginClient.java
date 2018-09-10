package com.xlr.udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

// 基于UDP的socket通讯, 客户端
public class LoginClient {
	public static void main(String[] args) {
		// 买礼物
		String info = "心型巧克力";
		byte[] infos = info.getBytes();
		InetAddress is;
		DatagramSocket socket = null;
		try {
			is = InetAddress.getByName("localhost");
			// 包裹包装礼物
			DatagramPacket dp = new DatagramPacket(infos, infos.length, is, 5000);
			socket = new DatagramSocket();
			// 通过快递点寄出礼物
			socket.send(dp);
			
			// 接收服务器的响应
			byte[] replys = new byte[1024];
			DatagramPacket dp1 = new DatagramPacket(replys, replys.length);
			socket.receive(dp1);
			String str = new String(replys, 0, replys.length);
			System.out.println("服务器端的响应" + str);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			socket.close();
		}
		
		
	}
}
