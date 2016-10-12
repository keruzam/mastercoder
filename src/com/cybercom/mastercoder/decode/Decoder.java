package com.cybercom.mastercoder.decode;

abstract public class Decoder {

	public static Decoder getInstance() {
		// Implement me
		return null;
	}

	/**
	 * @param value
	 *            - encoded text. See {@link Coder#code(String what, String alphabet)};
	 * @param alphabet
	 * @return decoded text
	 */
	public abstract Result decode(long value, String alphabet);

}
