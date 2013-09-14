/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.File;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:10:26:23 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class ListDirWithSubDir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/home/paynet" + File.separator + "Downloads";
		File file = new File(filePath);
		ListDirWithSubDir listDirWithSubDir = new ListDirWithSubDir();
		listDirWithSubDir.print(file);
	}

	/**
	 * @param file
	 */
	private void print(File file) {
		// TODO Auto-generated method stub
		if (file != null) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				if (files != null) {
					for (int i = 0; i < files.length; i++) {
						print(files[i]);
					}
				}
			} else {
				System.out.println(file.getName());
			}
		}
	}

}
