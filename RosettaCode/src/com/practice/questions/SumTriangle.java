package com.practice.questions;

import java.util.ArrayList;
import java.util.List;

public class SumTriangle {

	public static void main(String... args) {
		System.out.println("Test Test");
		
		List<Integer> row1 = new ArrayList<Integer>();
		List<Integer> row2 = new ArrayList<Integer>();
		List<Integer> row3 = new ArrayList<Integer>();
		List<Integer> row4 = new ArrayList<Integer>();
		
		row1.add(-1);
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		triangle.add(row1);
		triangle.add(row2);
		triangle.add(row3);
		triangle.add(row4);
		
		System.out.println(triangle);
		
	}
	
	static int sum(List<List<Integer>> triange) {
		
		return 0;
	}
	
}
