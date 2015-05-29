package com.practice.ds.queue;

import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class QueueDynamicTest {


	@Test
	public void testPush(){
		
		Queue<String> queue = new QueueDynamic<>();

		queue.push("a");
		queue.push("b");
		queue.push("c");
		

		assertEquals("a",queue.pop());
		assertEquals("b",queue.pop());
		assertEquals("c",queue.pop()); 
	}
	
	@Test
	public void testPushRandom(){
		
		Queue<String> queue = new QueueDynamic<>();

		queue.push("a");
		queue.push("b");
		assertEquals("a",queue.pop());
		
		queue.push("c");
		queue.push("d");
		

		assertEquals("b",queue.pop());
		assertEquals("c",queue.pop());
		assertEquals("d",queue.pop()); 
	}
	@Test
	public void testPushPop(){
		
		Queue<String> queue = new QueueDynamic<>();

		queue.push("a");
		assertEquals("a",queue.pop());
		
		queue.push("b");
		assertEquals("b",queue.pop());
		
		queue.push("c");
		assertEquals("c",queue.pop()); 
	}
	
	
}
