package com.practice.questions.lru;

public class LruTest {
	
	
	public static void main(String... args) {
		
		LRU lru = new LRU(3);

		lru.set(1, 1);
		lru.set(2, 2);
		lru.set(3, 3);
		lru.set(4, 4);

		System.out.println(lru.get(1)); 
		System.out.println(lru.get(3)); 

		lru.set(5, 5);
		lru.set(6, 6);


		System.out.println(lru.get(4));
		System.out.println(lru.get(3));

	}

}
