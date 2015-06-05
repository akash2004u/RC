package com.practice.questions;

public class StringMatcher {

	
	public static void main(String... args){
		

		System.out.println(match("20150531.1234567890"));
		System.out.println(match("20150531.123456789"));
		System.out.println(match("20150505"));
		
	}
	
	static boolean match(String val){
		String YYMMDD_EXPR =  "((19|20)\\d\\d)(0?[1-9]|1[012])(0?[1-9]|[12][0-9]|3[01])";
		String DIGIT10 = "([0-9]{10})";
		
		return val.matches(YYMMDD_EXPR + "\\."  + DIGIT10);
	}
}
