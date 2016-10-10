package com.cybercom.mastercoder.factorialtrailingzeros;

public class ZerosTest {

	public static void main(String[] args) {
		FactorialTrailingZeros zeros = Zeros.getInstance();
		int count = zeros.calculate(30, 16);
		System.out.println(count);
	}
}
