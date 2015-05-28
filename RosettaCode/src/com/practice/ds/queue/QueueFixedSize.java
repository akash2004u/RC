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
		
		rear++;
		if(rear == this.store.length) {
			rear = 0;
		}
		
		this.store[rear] = val;
	}

	@Override
	public Type peek() {
		bombIfEmpty();
		
		return null;
	}

	@Override
	public Type pop() {
		bombIfEmpty();
		
		return null;
	}

	@Override
	public int size() {
		if(rear < front)
			return this.store.length - front + rear;
		else 
			return front - rear;
	}
	
	private void bombIfFull() {
		if(size() > this.store.length)
			throw new RuntimeException("Queue Full");
	}
	
	private void bombIfEmpty() {
		if(size() == 0)
			throw new RuntimeException("Queue Empty");
	}
}
