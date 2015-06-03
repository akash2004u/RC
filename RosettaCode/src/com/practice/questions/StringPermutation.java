package com.practice.questions;

public class StringPermutation {

	
	public static void main(String... args){
		permute("abc");
	}
	
	static void permute(String val){
		
		permute(val.toCharArray(),0,val.length());
		
	}
	
	static void permute(char[] str,int start,int end) {
		
		if(start == end)
			System.out.println(str);
		else {
			for(int i = 0 ; i < str.length ; i++) {
				swap(str,start,i);
				permute(str,start,end);
				swap(str,i ,start);
			}
		}		
	}
	
	static void swap(char[] val,int i , int j) {
		char c = val[i];
		val[i] = val[j];
		val[j] = c;
	}
	
}
