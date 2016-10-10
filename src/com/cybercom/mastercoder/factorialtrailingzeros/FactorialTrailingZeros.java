package com.cybercom.mastercoder.factorialtrailingzeros;

abstract public class FactorialTrailingZeros {

	public static FactorialTrailingZeros getInstance() {
		// Implement me
		return null;
	}

	/**
	 * 
	 * @param number
	 *            - integer number (0 <= N <= 2^32)
	 * @param base
	 *            - base of the numerical system
	 * @return the number of zeros at the end of factorial of give number with
	 *         given numerical system base.
	 */
	public abstract int calculate(int number, int base);

}
