package com.cybercom.mastercoder.stockexchangeprofit;

import java.util.ArrayList;

/**
 * Zadanie 5
 * 
 * @author Tomasz Mazurek
 *
 */
public class Stock extends IStockExchangeProfit {

	private static final int MIN = 2;
	private static final int MAX = 1000000;

	public static IStockExchangeProfit getInstance() {
		return new Stock();
	}

	@Override
	public Profit findMaxProfit(ArrayList<Integer> values) {
		Profit maxProfit = new Profit(0, 0, 0);
		int size = values.size();
		if (size >= MIN && size <= MAX) {
			Integer profitVal = 0;
			Integer value = 0;
			for (int idx = 0; idx < size - 1; idx++) {
				value = values.get(idx);
				int idx2 = idx + 1;
				while (idx2 < size && value < values.get(idx2)) {
					profitVal = values.get(idx2) - value;
					if (profitVal > maxProfit.value) {
						maxProfit = new Profit(idx, idx2, profitVal);
					}
					idx2 = idx2 + 1;
				}
			}
		}
		return maxProfit;
	}
}
