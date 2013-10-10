/**
 * 
 */
package com.aoeng.thinkinjava.ch3.bitbyte;

/**
 * @author [ShaoCheng Zhang] Oct 10, 2013:10:17:38 AM
 * @Email [zhangshch2008@gmail.com]
 */
public class ByteAndBit {
	public static void main(String[] args) {

		// base();
		byte[] buf = "想".getBytes();
		for (byte b : buf) {
			System.out.println(byteToBit(b));
		}
		// System.out.println(new String());
		;

	}

	/**
	 * 
	 */
	private static void base() {
		// TODO Auto-generated method stub
		// 返回无符号的2进制表示 1110011
		String hex = Integer.toBinaryString(115);
		System.out.println(hex);
		// 返回2进制的字符串1110011对应的值 115
		System.out.println(Integer.valueOf("1110011", 2));

		// 16进制值转换成二进制
		System.out.println(Long.parseLong("49", 16));
		System.out.println(Long.parseLong("2F", 16));
	}

	/**
	 * Byte转Bit
	 */
	public static String byteToBit(byte b) {
		return "" + (byte) ((b >> 7) & 0x1) + (byte) ((b >> 6) & 0x1) + (byte) ((b >> 5) & 0x1) + (byte) ((b >> 4) & 0x1) + (byte) ((b >> 3) & 0x1) + (byte) ((b >> 2) & 0x1) + (byte) ((b >> 1) & 0x1)
				+ (byte) ((b >> 0) & 0x1);
	}

	/**
	 * Bit转Byte
	 */
	public static byte bitToByte(String byteStr) {
		int re, len;
		if (null == byteStr) {
			return 0;
		}
		len = byteStr.length();
		if (len != 4 && len != 8) {
			return 0;
		}
		if (len == 8) {// 8 bit处理
			if (byteStr.charAt(0) == '0') {// 正数
				re = Integer.parseInt(byteStr, 2);
			} else {// 负数
				re = Integer.parseInt(byteStr, 2) - 256;
			}
		} else {// 4 bit处理
			re = Integer.parseInt(byteStr, 2);
		}
		return (byte) re;
	}
}
