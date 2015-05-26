package com.practice.ds.stack.stockspan;

public class StockSpan_Raw {
	
	static int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
	
	public static void main(String... args){
		
		for(int i = 0 ; i < prices.length;i++) {
			System.out.println(String.format("Price Span for day %d is %d",(i+1),span(i)));
		}
		
	}

	static int span(int day){
		return span(day,prices[day]);
	}
	
	static int span(int day,int price){
		if(day < 1){
			return 1;
		}
		
		if(price >= prices[day-1]) {
		    return span(day-1,price)  + 1;
		}
		
		return 1;
	}

}
