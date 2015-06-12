package com.practice.questions.lru;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LRU {

	Map<Integer, Entry> store = new HashMap<Integer, Entry>();
	PriorityQueue<Entry> sequence ;
	int capacity ;
	
	public LRU(int capacity){
		this.sequence = new PriorityQueue<Entry>(capacity);
		this.capacity = capacity;
	}
    
	public void print(){
		System.out.println("***");
		System.out.println(this.store);
		System.out.println(this.sequence);
	}
    public int get(int key) {
        Entry entry = this.store.get(key);
        
        if(entry == null){
        	return 0;
        }
        
        entry.timeStamp = System.nanoTime();
        
        return entry.val;
    }
    
    public void set(int key, int value) {
        if(sequence.size() >= capacity) {
        	Entry entry = sequence.remove();
        	this.store.remove(entry.key);
        }
        
        Entry entry = new Entry();
        entry.key = key;
        entry.val = value;
        entry.timeStamp = System.nanoTime();
        
        store.put(key,entry);
        sequence.add(entry);
        
        print();
    }
	
}

class Entry implements Comparable<Entry> {
	Integer key;
	Integer val;
	Long timeStamp;
	
	
	@Override
	public int compareTo(Entry o) {
		
		if(o == null) 
			return +1;
		
		if(o instanceof Entry) {
			Entry that = (Entry) o;
			
			if (this.timeStamp  > that.timeStamp) 
				return +1 ;
			else if(that.timeStamp > this.timeStamp)
				return -1;
			else 
				return 0;
			
		} else 
			return +1;
	}
	
	public String toString(){
		return ""+this.key+"="+this.val+":"+this.timeStamp+"|";
	}
	
	
}
