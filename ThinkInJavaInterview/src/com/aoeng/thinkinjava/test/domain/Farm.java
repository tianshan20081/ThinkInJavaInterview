/**
 * 
 */
package com.aoeng.thinkinjava.test.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author [ShaoCheng Zhang] Oct 10, 2013:1:42:59 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class Farm {
	// cows集合存放所有母牛对象
	private List<Cow> cows = new ArrayList<Cow>();

	public List<Cow> getCows() {
		return cows;
	}

	public void setCows(List<Cow> cows) {
		this.cows = cows;
	}

	/*
	 * 第N年后农场的牛的数量
	 */
	public int getCowNum(int year) {
		// children集合存放每年所有母牛生的小母牛对象
		List<Cow> children = new ArrayList<Cow>();
		for (int i = 0; i < year; i++) {
			for (Cow c : cows) {
				c.grow();
				Cow cc = c.generation();
				if (cc != null) {// 如果该母牛可以产仔了，则将其产的小母牛加入children集合中
					children.add(cc);
				}
			}
			cows.addAll(children);// 将整个小母牛集合加入所有母牛的集合中
			children.clear();// 每年过后将children集合清空
		}
		return cows.size();
	}
}
