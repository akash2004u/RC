package com.practice.ds.queue;

import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class QueueFixedSizeTest {

	@Test
	public void testPop(){
		Queue<String> queue = new QueueFixedSize<>(2);
		try {
			queue.pop();
			fail();
		} catch(RuntimeException _ex){
			assertNotNull(_ex.getMessage());
		}
	}

	@Test
	public void testPushPop(){
		Queue<String> queue = new QueueFixedSize<>(2);

		queue.push("A");
		queue.push("B");

		assertEquals("A", queue.pop());
		assertEquals("B", queue.pop());

		try {
			queue.pop();
		} catch(RuntimeException _ex) {
			assertNotNull(_ex.getMessage());
		}
	}

	@Test
	public void testRemoveAdd(){
		Queue<String> queue = new QueueFixedSize<>(2);

		queue.push("A");
		queue.push("B");

		assertEquals("A", queue.pop());

		queue.push("X");

		assertEquals("B", queue.pop());
		assertEquals("X", queue.pop());


		queue.push("B");
		queue.push("E");
		
	}
}
