/**
 * 
 */
package com.aoeng.thinkinjava.ch8.io;

import java.io.Serializable;
import java.util.Date;

/**
 * @author [ShaoCheng Zhang] Sep 4, 2013:2:46:43 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class Person implements Serializable {
	private String name;
	private int age;
	private char sex;
	private Date birthday;

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param birthday
	 */
	public Person(String name, int age, char sex, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday + "]";
	}

}
