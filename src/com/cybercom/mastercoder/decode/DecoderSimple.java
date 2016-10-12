package com.cybercom.mastercoder.decode;

/**
 * Zadanie 6
 * 
 * @author Mazurek
 * 
 */
public class DecoderSimple extends Decoder {

	public static Decoder getInstance() {
		return new DecoderSimple();
	}

	@Override
	public Result decode(final long value, final String alphabet) {
		if (value == 3) {
			return new Result("", ResultCode.SUCCESS);
		}
		if (value >= 87) {
			long val = value;
			StringBuilder sb = new StringBuilder();
			while (val > 3) {
				long modResult = val % 29;
				sb.insert(0, alphabet.charAt((int) modResult));
				val = (val - modResult) / 29;
			}
			String decodedText = sb.toString();
			if (!decodedText.isEmpty()) {
				return new Result(decodedText, ResultCode.SUCCESS);
			}
		}
		return new Result("", ResultCode.FAILURE);
	}

}
