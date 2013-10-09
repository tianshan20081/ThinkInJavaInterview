package com.aoeng.thinkinjava.ch5.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * UDP 接收端，接收 upd 发送端 发送的数据
 */
public class UdpReceive {

	public static void main(String[] args) throws Exception {
		// 建立 DatagramSocket ，监听 端口号 为 10000 的端口
		DatagramSocket ds = new DatagramSocket(10000);
		while (true) {
			// 建立数据包
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			// 接收方法，传递数据报包
			ds.receive(dp);
			// int getLength(); 返回将要发送或接受到的数据的长度
			int length = dp.getLength();

			// InetAddress getAddress(); 返回 ip 地址
			String ip = dp.getAddress().getHostAddress();

			System.out.println(new String(buf, 0, length) + ":" + ip);

		}

	}

}
