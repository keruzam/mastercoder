package com.cybercom.mastercoder.decode;

/**
 * Zadanie 6 - dekoder
 * 
 * @author Tomasz Mazurek
 * 
 */
public class DecoderImpl extends Decoder {

	public static Decoder getInstance() {
		return new DecoderImpl();
	}

	@Override
	public Result decode(final long value, final String alphabet) {
		if (value >= 87 && alphabet.length() < 29 && isAlphabetUniqe(alphabet)) {
			try {
				long val = value;
				long countLoop = 0;
				StringBuilder sb = new StringBuilder();
				while (val > 3) {
					long modResult = val % 29;
					sb.insert(0, alphabet.charAt((int) modResult));
					val = (val - modResult) / 29;
					countLoop = countLoop + 1;
					if (countLoop > 12) {
						return failure();
					}
				}
				String decodedText = sb.toString();
				return !decodedText.isEmpty() ? success(decodedText) : failure();
			} catch (Exception e) {
				return failure();
			}
		}
		return failure();
	}

	private Result success(final String decodedText) {
		return new Result(decodedText, ResultCode.SUCCESS);
	}

	private Result failure() {
		return new Result("", ResultCode.FAILURE);
	}

	private boolean isAlphabetUniqe(final String alphabet) {
		for (char c : alphabet.toCharArray()) {
			if (alphabet.indexOf(c) != alphabet.lastIndexOf(c)) {
				return false;
			}
		}
		return true;
	}

}
