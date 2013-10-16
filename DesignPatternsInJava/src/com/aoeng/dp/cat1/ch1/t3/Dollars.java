/**
 * 
 */
package com.aoeng.dp.cat1.ch1.t3;

/**
 * @author [ShaoCheng Zhang] Oct 16, 2013:5:38:45 PM
 * @Email [zhangshch2008@gmail.com]
 */
public class Dollars {
	public static final Dollars cent = new Dollars(0.01);
	static final int CENT_PER_DOLLAR = 100;
	long cents;

	public Dollars(double value) {
		this.cents = Math.round(value * CENT_PER_DOLLAR);
	}

	public boolean isZero() {
		return cents == 0;
	}

	public Dollars plus(Dollars that) {
		return new Dollars(1.0 * (this.cents + that.cents) / CENT_PER_DOLLAR);
	}

	public Dollars times(int multiplier) {
		return new Dollars((this.cents * multiplier) / CENT_PER_DOLLAR);
	}

	public Dollars dividedBy(int divisor) {
		double newCents = (1.0 * cents / divisor) / CENT_PER_DOLLAR;
		return new Dollars(newCents);
	}

	public double dividedBy(Dollars that) {
		return (1.0 * this.cents) / that.cents;
	}

	public boolean isLessThan(Dollars that) {
		return this.cents < that.cents;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer result = new StringBuffer("$");
		long dollars = cents / CENT_PER_DOLLAR;
		result.append(dollars);
		result.append('.');
		long pennies = cents % CENT_PER_DOLLAR;
		if (pennies < 10)
			result.append('0');
		result.append(pennies);
		return result.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}
		Dollars that = (Dollars) obj;
		return this.cents == that.cents;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int) cents;
	}

	public long asCents() {
		return cents;
	}
}
