package com.cybercom.mastercoder.factorialtrailingzeros;

import java.math.BigInteger;

/**
 * Zadanie 4 - zliczanie zer z wyniku silni
 * 
 * @author Tomasz Mazurek
 *
 */
public class Zeros extends FactorialTrailingZeros {

	public static FactorialTrailingZeros getInstance() {
		return new Zeros();
	}

	@Override
	public int calculate(int number, int base) {
		if (number >= 0 && number <= Integer.MAX_VALUE && base >= 2
				&& base <= 16) {
			BigInteger factorial = getFactorial(BigInteger.valueOf(number));
			return countZeros(factorial.toString(base));
		}
		return 0;
	}

	private static BigInteger getFactorial(BigInteger number) {
		if (number.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else
			return number.multiply(getFactorial(number.add(BigInteger
					.valueOf(-1))));
	}

	private int countZeros(String number) {
		int count = 0;
		String numberStr = number;
		while ((numberStr.length() - 1) >= 0
				&& '0' == number.charAt(numberStr.length() - 1)) {
			count += 1;
			numberStr = numberStr.substring(0, numberStr.length() - 1);
		}
		return count;
	}

}
