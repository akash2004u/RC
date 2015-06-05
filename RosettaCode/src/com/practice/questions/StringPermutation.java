package com.practice.questions;

public class StringPermutation {

	static int count = 0;
	
	public static void main(String... args){
		permute("abc");
		System.out.println("Combinations :"+count);
	}
	
	static void permute(String val){
		permute("",val);
		
	}
	
	static void permute(String prefix, String val){
		if(val.length() == 0) {
			System.out.println(prefix);
			count ++;
		}
		
		for(int i = 0 ; i < val.length() ; i++){
			permute(prefix+val.charAt(i),val.substring(0,i)+val.substring(i+1));
		}
		
	}
	
}
