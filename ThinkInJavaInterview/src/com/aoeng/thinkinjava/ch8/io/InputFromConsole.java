/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.IOException;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:10:13:27 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class InputFromConsole {

	public static void main(String[] args) throws Exception {
		int a = 0;
		byte[] input = new byte[1024];
		System.in.read(input);
		System.out.println("your input is :" + new String(input));
	}
}
