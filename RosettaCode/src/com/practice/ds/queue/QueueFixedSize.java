package com.practice.ds.queue;

public class QueueFixedSize<Type> implements Queue<Type> {

	private Type[] store;
	
	int front = -1;
	int rear = -1;
	
	public QueueFixedSize() {
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public QueueFixedSize(int size){ 
		this.store = (Type[]) new Object[size];
	}
	
	@Override
	public void push(Type val) {
		bombIfFull();
		
		if(rear == this.store.length - 1){
			rear = -1;
		}
		
		this.store[++rear] = val;
	}

	@Override
	public Type peek() {
		bombIfEmpty();
		
		return this.store[front];
	}

	@Override
	public Type pop() {
		bombIfEmpty();
		
		if(front == this.store.length || front == -1){
			front = 0;
		}
		
		return this.store[front++];
	}

	@Override
	public int size() {
		return rear - front;
	}
	
	private void bombIfFull() {
		if(size() >= this.store.length)
			throw new RuntimeException("Queue Full");
	}
	
	private void bombIfEmpty() {
		if(size() == 0 )
			throw new RuntimeException("Queue Empty");
	}
}
