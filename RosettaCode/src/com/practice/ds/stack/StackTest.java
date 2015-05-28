package com.practice.ds.stack;

import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class StackTest {
	
	@Test
	public void testStackEmpty(){
		Stack target = new Stack(1);
		
		try {
			target.pop();
			fail();
		} catch(RuntimeException ex){
			assertNotNull(ex.getMessage());
		}
		
	}
	
	@Test
	public void testStackPush(){ 
		Stack target = new Stack(2);
		
		target.push(2);

		assertEquals(2,target.peek());
		assertEquals(2,target.peek());
		assertEquals(2,target.peek());
		
		assertEquals(2,target.pop());
		
	}
	
	@Test
	public void testStackFull() {
		Stack target = new Stack(2);

		target.push(2);
		target.push(4);
		
		try {
			target.push(5);
			fail();
		} catch(RuntimeException _ex){
			assertNotNull(_ex.getMessage());
		}
	}
	
	@Test
	public void testPushPoll(){
		Stack target = new Stack(4);

		target.push(1);
		target.push(2);
		target.push(3);
		target.push(4);

		assertEquals(4,target.pop());
		assertEquals(3,target.pop());
		assertEquals(2,target.pop());
		assertEquals(1,target.pop());
	}
	

	@Test
	public void testRandomPushPoll(){
		Stack target = new Stack(4);

		target.push(1);
		target.push(2);
		
		assertEquals(2,target.pop());
		assertEquals(1,target.pop());
		
		target.push(3);
		target.push(4);

		assertEquals(4,target.pop());
		assertEquals(3,target.pop());
		
	}
	
}
