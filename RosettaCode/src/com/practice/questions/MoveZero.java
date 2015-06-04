package com.practice.questions;

public class MoveZero {

	public static void main(String... args){
		System.out.println("Moving Zeroes to Start");
		
		int[] vals = new int[] {1,2,3,0,2,0,4,7,9,5,0};
		print(vals);
		vals = sortTail(vals);
		print(vals);
	}
	
	static int[] sortFront(int[] arr){
		int[] sorted = new int[arr.length];
		int k = arr.length - 1;
		for(int i = arr.length -1 ; i >= 0; i--){
			if(arr[i] != 0){
				sorted[k--] = arr[i];
			}
		}
		
		return sorted;
	}
	
	static int[] sortTail(int[] arr){
		int[] sorted = new int[arr.length];
		int k = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != 0)
				sorted[k++] = arr[i];
		}
		
		return sorted;
	}
	
	static void print(int[] arr){
		System.out.println();
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
