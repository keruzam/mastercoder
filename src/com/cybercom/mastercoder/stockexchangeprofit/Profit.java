package com.cybercom.mastercoder.stockexchangeprofit;

public class Profit {
	public int leftIndex;
	public int rightIndex;
	public int value;

	public Profit(Profit maxProfit) {
		this.leftIndex = maxProfit.leftIndex;
		this.rightIndex = maxProfit.rightIndex;
		this.value = maxProfit.value;
	}

	public Profit(int leftIndex, int rightIndex, int value) {
		this.leftIndex = leftIndex;
		this.rightIndex = rightIndex;
		this.value = value;
	}
}