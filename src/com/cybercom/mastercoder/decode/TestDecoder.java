package com.cybercom.mastercoder.decode;

public class TestDecoder {

	public static void main(final String[] args) {
		long result1 = code("abcdefghipon", "abcdefghijklmnop"); // 2121874
		long result2 = code("ddaaab", "gfedcab"); // 1848251554

		Decoder decoder = DecoderSimple.getInstance();

		System.out.println(result1);
		System.out.println(result2);

		long longValue = 1061895643982745793l;
		Result resultObj1 = decoder.decode(longValue, "abcdefghijklmnop");
		Result resultObj2 = decoder.decode(3, "gfedcab");

		System.out.println(resultObj1.getDecodedText() + " " + resultObj1.getResultCode());
		System.out.println(resultObj2.getDecodedText() + " " + resultObj2.getResultCode());

		Result resultObj3 = decoder.decode(1848251554, "abcdessssssssfdsfsfsfsdsfrfedssrfesss");
		System.out.println(resultObj3.getDecodedText() + " " + resultObj3.getResultCode());

	}

	public static long code(final String what, final String alphabet) {
		long value = 3;
		for (int i = 0; i < what.length(); i++) {
			value = value * 29 + alphabet.indexOf(what.charAt(i));
		}
		return value;
	}

}
