package com.aoeng.thinkinjava.ch5.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * udp 协议，大小 64K
 * 	效率高
 * 	无连接
 * 	不可靠
 * 	数据被限制在 64 K 以内
 * 
 * DatagramPacket 对象，数据包
 * 	投放的目的地（主机名，ip 地址 192.168.3.1）
 * 	端口号（应用程序的物理表示 10000）
 * 	发送的数据
 * 
 * DatagramSocket 对象，
 *	接收和发送数据包
 *	将数据包DatagramPacket 接收进来，和发送出去
 * 
 * 
 */

/*
 * UDP 的数据发送端，将数据打包成 DatagramPacket 
 */
public class UdpSend {

	public static void main(String[] args) throws Exception {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(in);
		String line = null;
		// 建立 DatagramSocket 用来发送数据
		DatagramSocket ds = new DatagramSocket();
		while ((line = bfr.readLine()) != null) {

			byte[] buf = line.getBytes();
			DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.7.92"), 10000);

			ds.send(dp);
			System.out.println("Data Send ok");
			if ("88".equals(line)) {
				break;
			}
		}
		// 建立 DatagramPacket 对象,封装数据包包含数据包，发送的数据，目的地
		// byte[] buf = "你好 Java 程序员".getBytes();
		ds.close();
	}
}
