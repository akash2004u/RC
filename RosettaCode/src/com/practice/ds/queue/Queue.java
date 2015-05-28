package com.practice.ds.queue;

public interface Queue<Type> {

	public void push(Type val);
	public Type peek();
	public Type pop();
	public int size();
	
}
