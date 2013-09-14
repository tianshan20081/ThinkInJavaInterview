/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:10:47:15 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class InputStreamDemo {
	public static void main(String[] args) {
		InputStreamDemo inputStreamDemo = new InputStreamDemo();
		String src = "/home/paynet/" + File.separator + "Downloads" + File.separator + "io.txt";
		inputStreamDemo.readFile(src);
	}

	/**
	 * @param src
	 */
	private void readFile(String src) {
		// TODO Auto-generated method stub
		File file = new File(src);
		InputStream stream = null;
		if (file != null) {
			try {
				stream = new FileInputStream(file);
				byte[] b = new byte[(int) file.length()];
				for (int i = 0; i < b.length; i++) {
					b[i] = (byte) stream.read();
				}
				System.out.println(new String(b));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (stream != null) {
						stream.close();
						stream = null;
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

}
