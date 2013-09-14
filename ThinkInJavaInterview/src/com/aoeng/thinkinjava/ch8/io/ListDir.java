/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.File;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:10:22:33 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class ListDir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "/home" + File.separator + "paynet" + File.separator + "Downloads";
		File file = new File(fileName);
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}

}
