package com.akash.rosetta.doors100;

import java.util.ArrayList;
import java.util.List;

public class HundredDoors {

	public static void main(String... args){

		boolean[]  doors = new boolean[100];
		
		for(int i = 1 ; i < 101;i++){
			System.out.println("Pass :"+i+" :::::::::::::::::");
			passDoors(doors,i);
			printDoors(doors);
			System.out.println("********************************");
		}
		
		printDoors(doors);

	}
	
	private static void passDoors(boolean[] doors,int pass){
		for(int i = pass - 1;i < doors.length;) {
			System.out.print(" i:"+i);
			doors[i] = !doors[i];
			i += pass;
		}		
	}

	private static void printDoors(boolean[] doors){
		List<String> values = new ArrayList<>();
		
		for(int i =1;i <= doors.length;i++){
			if(doors[i -1])
				values.add(""+i);
		}
		System.out.println("\n\nOpen Doors:"+values+":\n");
	}

}
