package com.practice.ds.stack.stockspan;

import java.util.Stack;

public class StockSpan_Optimized {

	static int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
	
	static Stack<Integer> highPrices = new Stack<>();
	
	public static void main(String... args){

		for(int i = 0;i < prices.length ;i++){
			//if(highPrices.peek() > prices[i]) {
				highPrices.push(i);
			//}
		}

		System.out.println("Akash".hashCode());
		System.out.println("Akash".hashCode());
		System.out.println("Akash Yadav".hashCode());
		System.out.println("Akash Yadav".hashCode());

	}
	
	static int span(int day){
		while(true){
			if(highPrices.peek() > day) {
				highPrices.pop();
			} else {
				
			}
		}
	}
	
}
