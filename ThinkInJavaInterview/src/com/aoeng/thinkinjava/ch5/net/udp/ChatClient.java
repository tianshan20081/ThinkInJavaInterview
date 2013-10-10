/**
 * 
 */
package com.aoeng.thinkinjava.ch5.net.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author [ShaoCheng Zhang] Oct 10, 2013:9:38:15 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class ChatClient {
	private DatagramSocket ds;
	private DatagramPacket dp;
	private InputStreamReader in;
	private BufferedReader bfr;
	private String line;
	private byte[] buf;
	private String ip;
	private int port;

	/**
	 * @param ip
	 * @param port
	 * @throws Exception
	 */
	public ChatClient(String ip, int port) throws Exception {
		// TODO Auto-generated constructor stub
		this.ip = ip;
		this.port = port;
		ds = new DatagramSocket();
		in = new InputStreamReader(System.in);
		bfr = new BufferedReader(in);
	}

	/**
	 * @throws Exception
	 * 
	 */
	public void start() throws Exception {
		// TODO Auto-generated method stub
		while ((line = bfr.readLine()) != null) {
			buf = line.getBytes();
			dp = new DatagramPacket(buf, buf.length, InetAddress.getByName(ip), port);
			ds.send(dp);
			System.out.println("Data Send ok ...");
			if ("88".equalsIgnoreCase(line)) {
				break;
			}
		}
		System.out.println("bye bye ...");
		ds.close();
	}

}
