package com.cybercom.mastercoder.stockexchangeprofit;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStock {

	public static void main(String[] args) {
		IStockExchangeProfit stock = Stock.getInstance();
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.addAll(Arrays.asList(5, 10, 20));

		Profit profit = stock.findMaxProfit(values);

		System.out.println(profit.leftIndex);
		System.out.println(profit.rightIndex);
		System.out.println(profit.value);
	}
}
