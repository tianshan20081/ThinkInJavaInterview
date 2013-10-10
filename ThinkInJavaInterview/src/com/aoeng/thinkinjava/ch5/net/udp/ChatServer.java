/**
 * 
 */
package com.aoeng.thinkinjava.ch5.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author [ShaoCheng Zhang] Oct 10, 2013:9:38:24 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class ChatServer {
	private DatagramPacket dp;
	private DatagramSocket ds;
	private byte[] buf;
	private int length;

	/**
	 * @param port
	 * @throws SocketException
	 */
	public ChatServer(int port) throws SocketException {
		// TODO Auto-generated constructor stub
		ds = new DatagramSocket(port);
		buf = new byte[1024];
		dp = new DatagramPacket(buf, buf.length);
	}

	/**
	 * @throws Exception
	 * 
	 */
	public void start() throws Exception {
		// TODO Auto-generated method stub
		while (true) {
			ds.receive(dp);
			length = dp.getLength();
			System.out.println(new String(buf, 0, length));
		}
	}

}
