package com.aoeng.thinkinjava.ch5.net.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/*
 * 泛型 jdk 1.5 之后  解决程序中的安全问题，将要出现的问题 由运行时期，提前到编译时期。
 * 泛型，就是规定了一个数据类型，稽核职能存储这个数据类型。
 * 泛型的出现避免了强制类型的转换
 * 集合类<数据类型> 变量=new 集合类<数据类型>();
 */
public class GenericDemo {
	public static void main(String[] args) {
//		genericForList();
//		genericForSet();
		genericForTreeSet();
		genericForTreeSet2();
		
		
	}

	private static void genericForTreeSet2() {
		// TODO Auto-generated method stub
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("zhangsan", 15));
		set.add(new Person("zhangsan2", 16));
		//比较元素的 hashCode() 和 equals() 方法
		set.add(new Person("zhangsan3", 17));
//		set.add(new Person("zhangsan3", 17));
		
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void genericForTreeSet() {
		// TODO Auto-generated method stub
		TreeSet set = new TreeSet();
		set.add(new Person("zhangsan", 15));
		set.add(new Person("zhangsan2", 16));
		//比较元素的 hashCode() 和 equals() 方法
		set.add(new Person("zhangsan3", 17));
//		set.add(new Person("zhangsan3", 17));
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void genericForSet() {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("zhangsan", 15));
		set.add(new Person("zhangsan2", 16));
		//比较元素的 hashCode() 和 equals() 方法
		set.add(new Person("zhangsan3", 17));
		set.add(new Person("zhangsan3", 17));
		
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void genericForList() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("abs1");
		list.add("abs2");
		list.add("abs3");
		list.add("abs4");
		list.add("abs5");
		//迭代器 取出 集合中存储的元素，并且 ，得到字符串的长度
		//迭代器 也需要泛型限制，迭代器的泛型，跟随取出的集合泛型
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			//既然迭代器已经指定了泛型，就是 String 类型，取出元素的数据类型也是 String 类型
			String str = it.next();
			System.out.println(str + str.length());
		}
	}

}
