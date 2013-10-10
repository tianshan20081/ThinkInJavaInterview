/**
 * 
 */
package com.aoeng.thinkinjava.test;

import com.aoeng.thinkinjava.test.domain.Cow;
import com.aoeng.thinkinjava.test.domain.Farm;

/**
 * @author [ShaoCheng Zhang] Oct 10, 2013:1:38:11 PM
 * @Email [zhangshch2008@gmail.com]
 */

/**
 * 农场有头大母牛，每年生头小母牛，小母牛五年后生小母牛，问20年后农场一共有多少头牛？（用面向对象的思想）
 * 采用面向对象的思想：农场是一个对象，农场这个对象里存放着母牛，该对象应该提供一个方法用于统计N年后农场的母牛的总数。
 * 母牛也是一个对象，母牛这个对象里有一个年龄属性，该对象有生长的方法以及生育的方法。
 * 
 * @author YCY
 * 
 */
public class FarmAndCow {

	public static void main(String[] args) {
		Farm farm = new Farm();
		// 首先创建一个已经可以产仔的母牛对象
		Cow c = new Cow(5);
		// 将这个母牛添加到农场中
		farm.getCows().add(c);
		int num = farm.getCowNum(20);// 20年后农场的牛的总数
		System.out.println(num);// 结果：431
	}

}
