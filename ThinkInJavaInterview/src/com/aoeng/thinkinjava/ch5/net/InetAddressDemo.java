/**
 * 
 */
package com.aoeng.thinkinjava.ch5.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author [ShaoCheng Zhang] Oct 14, 2013:1:57:19 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		// 使用域名创建对象
		InetAddress address = InetAddress.getByName("www.baidu.com");
		System.out.println(address.getHostAddress());

		// 通过　ip　地址创建对象
		address = InetAddress.getByName(address.getHostAddress());

		// 获得对象中存储的域名
		System.out.println(address.getHostName());
		// 获得本机对象地址
		address = InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());

	}

}
