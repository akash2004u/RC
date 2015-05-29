package com.practice.ds.queue;

public class QueueDynamic<Type> implements Queue<Type> {

	Entry<Type> head;
	Entry<Type> tail;
	
	@Override
	public void push(Type val) {
		if(tail == null){
			tail = new Entry<>();
			head = tail;
		} else {
			tail.next = new Entry<>();
			tail = tail.next;
		}

		tail.val = val;
	}

	@Override
	public Type peek() {
		if(head == null)
			throw new RuntimeException("Empty Queue");
		
		return head.val;
	}

	@Override
	public Type pop() {
		Entry<Type> val = head;
		if(head == null)
			throw new RuntimeException("Emtpy Queue , Can't Pop");
		
		head = head.next;
		
		return val.val;
	}

	@Override
	public int size() {
		Entry pointer = head;
		
		int count = 0;
		while(pointer != null){
			count++;
			pointer = pointer.next;
		}
		
		return count;
	}
	
	
	class Entry<Type> {
		Type val;
		Entry<Type> next;
		
		public String toString() {
			return "["+val+"|->"+next;
		}
	}
	
	public String toString(){
		return ""+head;
	}

}
