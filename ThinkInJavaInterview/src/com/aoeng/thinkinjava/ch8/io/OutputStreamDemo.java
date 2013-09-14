/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:11:08:08 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class OutputStreamDemo {

	public static void main(String[] args) {
		String dirSrc = "/home/paynet/Downloads/hello.txt";
		String str = "  this is a file's content";
		OutputStreamDemo outputStreamDemo = new OutputStreamDemo();
		outputStreamDemo.writeWithByte(dirSrc, str);
		outputStreamDemo.writeWithByteArray(dirSrc, str);
	}

	/**
	 * @param dirSrc
	 * @param str
	 */
	private void writeWithByteArray(String dirSrc, String str) {
		// TODO Auto-generated method stub
		File file = new File(dirSrc);
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file, true);
			byte[] bs = str.getBytes();
			for (int i = 0; i < bs.length; i++) {
				outputStream.write(bs[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (outputStream != null) {
					outputStream.close();
					outputStream = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	/**
	 * @param dirSrc
	 * @param str
	 */
	private void writeWithByte(String dirSrc, String str) {
		// TODO Auto-generated method stub
		File file = new File(dirSrc);
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file, true);
			byte[] bs = str.getBytes();
			outputStream.write(bs);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (outputStream != null) {
					outputStream.close();
					outputStream = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
