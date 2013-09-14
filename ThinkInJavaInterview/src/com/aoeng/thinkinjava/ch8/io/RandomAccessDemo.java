/**
 *  RandomAccessFile 主要用于 多线程下载  
 *  http://blog.csdn.net/akon_vm/article/details/7429245
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:2:05:13 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class RandomAccessDemo {
	public static void main(String[] args) {
		String content = "this is the file's Content";
		String filePath = "/home/paynet/Downloads/ra.txt";
		RandomAccessDemo accessDemo = new RandomAccessDemo();
		accessDemo.writeToFile(content, filePath);
		accessDemo.readFromFile(filePath);
	}

	/**
	 * @param filePath
	 */
	private void readFromFile(String filePath) {
		// TODO Auto-generated method stub
		RandomAccessFile randomIO = null;
		try {
			File file = new File(filePath);
			randomIO = new RandomAccessFile(file, "r");
			char ch = randomIO.readChar();
			System.out.println(ch);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @param content
	 * @param filePath
	 */
	private void writeToFile(String content, String filePath) {
		// TODO Auto-generated method stub
		RandomAccessFile randomIO = null;
		try {
			File file = new File(filePath);
			randomIO = new RandomAccessFile(file, "rw");
			randomIO.writeBytes(content);
			randomIO.writeInt(12);
			randomIO.writeBoolean(true);
			randomIO.writeChar('A');
			randomIO.writeChars("chars");
			randomIO.writeUTF("这是一个测试文件");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (randomIO != null) {
					randomIO.close();
					randomIO = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
