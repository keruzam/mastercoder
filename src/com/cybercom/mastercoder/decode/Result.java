package com.cybercom.mastercoder.decode;

public class Result {

	private String decodedText;
	private ResultCode resultCode;

	public Result(String decodedText, ResultCode resultCode) {
		this.decodedText = decodedText;
		this.resultCode = resultCode;
	}

	public String getDecodedText() {
		return decodedText;
	}

	public ResultCode getResultCode() {
		return resultCode;
	}

	public void setDecodedText(String decodedText) {
		this.decodedText = decodedText;
	}

	public void setResultCode(ResultCode resultCode) {
		this.resultCode = resultCode;
	}
}
