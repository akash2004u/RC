package com.akash.rosetta.game24;

import java.util.Random;

public class Game24 {

	public static void main(String... args){
		System.out.println("Starting");
		
		print(randomDigits());
		
	}
	
	static void print(int[] digits){
		for(int i =0; i < digits.length;i++){
			System.out.print(digits[i] + "  ");
		}
		System.out.println();
	}
	
	static int evaluateInfix(String expr){
		
		
		return -1;
	}
	
	static int[] randomDigits(){
		int[] digits = new int[4];
		
		Random random = new Random();
		
		for(int i =0;i< 4;i++){
			digits[i] = random.nextInt(8)+1;
		}
		
		return digits;
	}
	
}
