package com.practice.ds.stack;

public class Stack {

	int[] items;
	int pointer = -1;
	
	public Stack(){
		this(10);
	}
	
	public Stack(int capacity){
		this.items = new int[capacity];
	}
	
	public void push(int item){
		bombIfFull();
		
		items[++pointer] = item;
	}
	
	public int peek(){
		bombIfEmpty();
	
		return items[pointer];
	}
	
	public int pop() {
		bombIfEmpty();
		
		return items[pointer--];
	}
	
	private void bombIfFull(){
		if(pointer == items.length - 1) {
			throw new RuntimeException("Stack Full");
		}
	}

	private void bombIfEmpty() {
		if(pointer < 0) 
			throw new RuntimeException("Stack Empty");
	}
	
}
