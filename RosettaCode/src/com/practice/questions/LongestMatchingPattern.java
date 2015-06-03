package com.practice.questions;

import java.util.HashMap;
import java.util.Map;

public class LongestMatchingPattern {


	public static void main(String... args){
		Dictionary d = new Dictionary();
		
		d.put("mango");
		d.put("man");
		d.put("multiple");
		d.put("alpha");
		d.put("beta");
		
		System.out.println("Longest Match :"+d.longestMatch("mul"));
	}

}

class Dictionary {
	Map<Character, TrieNode> words = new HashMap<Character, TrieNode>();

	void put(String word){
		TrieNode root = null;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			if(i  == 0){
				root = words.get(c);
				if(root == null) {
					root = new TrieNode(c);
					words.put(c, root);
				}
			}
			
			if(root.children.get(c) == null){
				TrieNode val = new TrieNode(c);
				root.children.put(c, val);
				root = val;
			}
		}
		
	}
	
	public String longestMatch(String str) {
		TrieNode root = null;
		for(int i = 0;i < str.length(); i++){
			char c = str.charAt(i);
			
			if(i == 0){
				root = words.get(c);
				if(root == null){
					return "";
				}
			}
			
			if(root.children.get(c) == null){
				return str.substring(0,i);
			} else {
				root = root.children.get(c);
			}
		}
		
		return str;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Dict = [\n");
		for(TrieNode node : words.values()) {
			sb.append(node);
			sb.append("_______________");
		}
		
		sb.append("\n]");
		return sb.toString();
	}
		
}

class TrieNode {
	
	char c;
	Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();

	public TrieNode(char c) {
		this.c = c;
	}
	
	public void addChildren(char c){
		this.children.put(c, new TrieNode(c));
	}
	
	public TrieNode getChildren(char c){
		return this.children.get(c);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		sb.append(c);
		sb.append("->");
		for(TrieNode node :children.values()) {
			sb.append("|>");
			sb.append(node);
		}
		
		return sb.toString();
	}
}