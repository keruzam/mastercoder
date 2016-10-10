package com.cybercom.mastercoder.stockexchangeprofit;

import java.util.ArrayList;

public abstract class IStockExchangeProfit {

	// Put implementation creating IStockExchangeProfit derived object in
	// implementation file
	public static IStockExchangeProfit getInstance() {
		throw new RuntimeException("please implement this");
	}

	public abstract Profit findMaxProfit(ArrayList<Integer> values);
}
