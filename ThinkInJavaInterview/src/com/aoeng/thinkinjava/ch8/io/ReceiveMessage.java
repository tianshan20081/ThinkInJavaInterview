/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.PipedInputStream;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:2:37:59 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class ReceiveMessage implements Runnable {
	private PipedInputStream in = null;

	/**
	 * @return the in
	 */
	public PipedInputStream getIn() {
		return in;
	}

	/**
	 * @param in
	 *            the in to set
	 */
	public void setIn(PipedInputStream in) {
		this.in = in;
	}

	public ReceiveMessage() {
		this.in = new PipedInputStream();
	}

	public void receive() {
		byte[] b = new byte[1024];
		int len = 0;
		String msg = "";
		try {
			len = in.read(b);
			msg = new String(b, 0, len);
			if (msg.equals("start")) {
				System.out.println("received the start message ,receive now you can do something");
				Thread.interrupted();
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (in != null) {
					in.close();
					in = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			receive();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
