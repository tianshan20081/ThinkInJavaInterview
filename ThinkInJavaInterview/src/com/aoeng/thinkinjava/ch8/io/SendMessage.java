/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.PipedOutputStream;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:2:33:55 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class SendMessage implements Runnable {

	private PipedOutputStream out = null;

	/**
	 * @return the out
	 */
	public PipedOutputStream getOut() {
		return out;
	}

	/**
	 * @param out
	 *            the out to set
	 */
	public void setOut(PipedOutputStream out) {
		this.out = out;
	}

	public SendMessage() {
		this.out = new PipedOutputStream();
	}

	public void send() {
		String msg = "start";
		try {
			out.write(msg.getBytes());

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (out != null) {
					out.close();
					out = null;
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
			System.out.println("waiting for signal ...");
			Thread.sleep(2000);
			send();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
