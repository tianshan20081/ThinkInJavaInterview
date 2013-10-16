/**
 * 
 */
package com.aoeng.dp.cat1.ch1.t3;

/**
 * @author [ShaoCheng Zhang] Oct 16, 2013:5:36:44 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class Firework {

	private String name;
	private double mass;
	private Dollars price;

	public static Firework lookup(String name) {
		return new Firework(name, 9.0, new Dollars(3));
	}

	public static Firework getRandom() {
		return new Firework("Random firework", 10.0, new Dollars(15));
	}

	/**
	 * @param name2
	 * @param d
	 * @param dollars
	 */
	public Firework(String name2, double d, Dollars dollars) {
		// TODO Auto-generated constructor stub
	}

}
