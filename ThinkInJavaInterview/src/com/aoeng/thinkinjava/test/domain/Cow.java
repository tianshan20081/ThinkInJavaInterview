/**
 * 
 */
package com.aoeng.thinkinjava.test.domain;

/**
 * @author [ShaoCheng Zhang] Oct 10, 2013:1:38:26 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class Cow {

	private int age;

	/**
	 * 
	 */
	public Cow() {
		super();
	}

	/**
	 * @param age
	 */
	public Cow(int age) {
		super();
		this.age = age;
	}

	/**
	 * 牛增长一岁
	 */
	public void grow() {
		this.age++;
	}

	/*
	 * 母牛生小牛，如果年龄达到5岁，则可以每年都生一头小母牛，反之，则不能生育，返回null
	 */
	public Cow generation() {
		if (this.age >= 5) {
			return new Cow(0);
		}
		return null;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cow [age=" + age + "]";
	}

}
