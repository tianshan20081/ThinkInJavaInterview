/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:11:22:47 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class CopyFileDemo {

	public static void main(String[] args) {
		String src = "/home/paynet/Downloads/Android-1_0-CC.pdf";
		String dirstFile = "/home/paynet/Downloads/test.pdf";
		String dirst2 = "/home/paynet/Downloads/test2.pdf";
		String dirst3 = "/home/paynet/Downloads/test3.pdf";
		CopyFileDemo copyFileDemo = new CopyFileDemo();
		long sTime = System.currentTimeMillis();
		copyFileDemo.copy(src, dirstFile);
		long mTime = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis() - sTime);
		copyFileDemo.copyByBuffer(src, dirst2);
		long bTime = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis() - mTime);
		copyFileDemo.copyByByteArray();
		System.out.println(System.currentTimeMillis() - bTime);
	}

	/**
	 * @param src
	 * @param dirst3
	 */
	private void copyByByteArray() {
		// TODO Auto-generated method stub
		ByteArrayInputStream bais = null;
		ByteArrayOutputStream baos = null;
		String str = "this is byteArray test ";
		try {
			bais = new ByteArrayInputStream(str.getBytes());
			baos = new ByteArrayOutputStream();
			int temp = 0;
			while ((temp = bais.read()) != -1) {
				char ch = (char) temp;
				baos.write(Character.toLowerCase(ch));
			}
			String outStr = baos.toString();
			bais.close();
			baos.close();
			System.out.println(outStr);

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (baos != null) {
					baos.close();
					baos = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (bais != null) {
					bais.close();
					bais = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	/**
	 * @param srcFile
	 * @param dirstFile
	 */
	private void copyByBuffer(String src, String dirst) {
		// TODO Auto-generated method stub
		File srcFile = new File(src);
		File dirstFile = new File(dirst);
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(srcFile));
			out = new BufferedOutputStream(new FileOutputStream(dirstFile));
			byte[] bs = new byte[1024];
			while (in.read(bs) != -1) {
				out.write(bs);
			}
			out.flush();
			System.out.println("Copied File :" + srcFile.getName() + " with  " + srcFile.length());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (out != null) {
					out.close();
					out = null;
				}
				if (in != null) {
					in.close();
					in = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	/**
	 * @param srcFile
	 * @param dirstFile
	 */
	private void copy(String src, String dirst) {
		// TODO Auto-generated method stub
		File srcFile = new File(src);
		File dirstFile = new File(dirst);
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(dirstFile);
			byte[] bs = new byte[(int) srcFile.length()];
			for (int i = 0; i < bs.length; i++) {
				bs[i] = (byte) in.read();
			}
			out.write(bs);
			System.out.println("copied File :" + srcFile.getName() + "with " + srcFile.length());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (out != null) {
					out.close();
					out = null;
				}
				if (in != null) {
					in.close();
					in = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
