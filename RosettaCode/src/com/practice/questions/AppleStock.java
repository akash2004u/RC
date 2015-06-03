package com.practice.questions;

public class AppleStock {
	
	static int[] prices = new int[] {1,2,3,4,5,6,7};
	
	public static void main(String... args){
	
		int minPrice = prices[0];
		int maxProfit = 0;
		
		for(int i = 0;i < prices.length; i++){
			minPrice = min(minPrice, prices[i]);
		}
		
	}
	
	static int min(int val1,int val2){
		return val1 < val2 ? val1 : val2;
	}

}


/** 
 * Problem Statement
I have an array stock_prices_yesterday where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.

For example, the stock cost $500 at 10:30am, so stock_prices_yesterday[60] = 500.

Write an efficient algorithm for computing the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

No "shorting"—you must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass). 


**/