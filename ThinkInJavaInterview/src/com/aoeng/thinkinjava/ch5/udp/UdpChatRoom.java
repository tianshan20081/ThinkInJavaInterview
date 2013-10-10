/**
 * 
 */
package com.aoeng.thinkinjava.ch5.udp;

import java.net.SocketException;

public class UdpChatRoom {
	public static void main(String[] args) throws Exception {
		int port = 10000;
		String ip = "127.0.0.1";
		final ChatServer server = new ChatServer(port);
		final ChatClient client = new ChatClient(ip, port);
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					server.start();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					client.start();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

	}

}
