/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:2:42:58 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class TestPipeStream {
	public static void main(String[] args) {
		SendMessage sendMessage = new SendMessage();
		ReceiveMessage receiveMessage = new ReceiveMessage();
		try {
			sendMessage.getOut().connect(receiveMessage.getIn());
			Thread t1 = new Thread(sendMessage);
			Thread t2 = new Thread(receiveMessage);
			t1.start();
			t2.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
