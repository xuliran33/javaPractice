package com.xlr.udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class LoginServer {
	public static void main(String[] args) {
		// 准备了一个空包, 接收数据
		byte[] infos = new byte[1024];
		DatagramPacket dp = new DatagramPacket(infos, infos.length);
		// 快递点
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(5000);
			// 在快递点接收礼物
			socket.receive(dp);
			// 拆礼物
			String info = new String(dp.getData(), 0, dp.getData().length);
			System.out.println("客户端说: " + info);
			
			// 给客户端一个响应
			String reply = "收到数据";
			// 客户端的地址
			SocketAddress sa = dp.getSocketAddress();
			byte[] replys = reply.getBytes();
			// 打一个包裹
			DatagramPacket dp1 = new DatagramPacket(replys, replys.length, sa);
			// 寄出去
			socket.send(dp1);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			socket.close();
		}
	}
}
