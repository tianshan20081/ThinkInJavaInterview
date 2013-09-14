/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:2:51:13 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class SerilizablePersonToFile {

	public static void main(String[] args) {
		String filePath = "/home/paynet/Downloads/sf.txt";
		SerilizablePersonToFile personToFile = new SerilizablePersonToFile();
		personToFile.serilizeToFile(filePath);
		personToFile.serilizeFromFile(filePath);
	}

	/**
	 * @param filePath
	 */
	private void serilizeFromFile(String filePath) {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		ObjectInputStream os = null;
		try {
			fin = new FileInputStream(new File(filePath));
			os = new ObjectInputStream(fin);
			List<Person> persons = (List<Person>) os.readObject();
			for (Person person : persons) {
				System.out.println(person.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (os != null) {
					os.close();
					os = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (fin != null) {
					fin.close();
					fin = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	/**
	 * @param filePath
	 * 
	 */
	private void serilizeToFile(String filePath) {
		// TODO Auto-generated method stub
		List<Person> persons = initList();
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		try {
			fs = new FileOutputStream(new File(filePath));
			os = new ObjectOutputStream(fs);
			os.writeObject(persons);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (os != null) {
					os.close();
					os = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (fs != null) {
					fs.close();
					fs = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	/**
	 * @return
	 */
	private List<Person> initList() {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("zhangsan", 20, 'N', new Date()));
		list.add(new Person("zhangsan2", 20, 'N', new Date()));
		list.add(new Person("zhangsan3", 20, 'N', new Date()));
		list.add(new Person("zhangsan4", 20, 'N', new Date()));
		list.add(new Person("zhangsan5", 20, 'N', new Date()));
		list.add(new Person("zhangsan6", 20, 'N', new Date()));
		list.add(new Person("zhangsan7", 20, 'N', new Date()));
		list.add(new Person("zhangsan8", 20, 'N', new Date()));
		list.add(new Person("张三", 20, 'N', new Date()));
		return list;
	}
}
