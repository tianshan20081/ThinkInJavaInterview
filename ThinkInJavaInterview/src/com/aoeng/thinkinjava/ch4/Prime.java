package com.aoeng.thinkinjava.ch4;

import org.junit.Test;

public class Prime {
	@Test
	public void test2() {
		// TODO Auto-generated method stub
		int n = 20 ;
		int array[] = new int[n];
		for (int i = 2; i < array.length; i++) {
			array[i] = i ;
		}
		for (int i = 2; i < array.length; i++) {
			if (array[i] != 0) {
				int j,temp ;
				temp = array[i];
				for (int k = 2*temp; k < array.length; k=k+temp) {
					array[k] = 0;
				}
				System.out.println("\n");
			}
		}
	}

	@Test
	public void test() throws Exception {
		for (int i = 2; i <= 20; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is a Prime");
			}
		}
	}

	private boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}

}
