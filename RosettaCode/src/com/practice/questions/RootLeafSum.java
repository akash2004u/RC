package com.practice.questions;

public class RootLeafSum {
	
	
	public static void main(String... args){
		System.out.println("Starting Tree");
		
		Node root = new Node(10);
		root.leftNode = new Node(8);
		root.leftNode.leftNode = new Node(3);
		root.leftNode.rightNode = new Node(5);
		
		root.rightNode = new Node(2);
		root.rightNode.leftNode = new Node(2);

		System.out.println("Max Sum 12:"+findSum(root,12));
		System.out.println("Max Sum 22:"+findSum(root,22));
		System.out.println("Max Sum 32:"+findSum(root,32));
		System.out.println("Max Sum 14:"+findSum(root,14));
		System.out.println("Max Sum 21:"+findSum(root,21));
		System.out.println("Max Sum 23:"+findSum(root,23));
		
		System.out.println("Maximum sum of Node : "+ findMax(root));
	}

	static int findMax(Node root) {
		if(root == null)
			return 0;
		
		if(root.leftNode == null && root.rightNode == null){
			return root.data;
		}
		
		return root.data + max(findMax(root.leftNode),findMax(root.rightNode));
	}
	
	static int max(int val1,int val2){
		if(val1 > val2)
			return val1;
		
		return val2;
	}
	
	static boolean findSum(Node root, int sum) {
		return findSum(root,sum,"");
	}
	static boolean findSum(Node root, int sum,String path) {
		if(root == null)
			return false;
		
		if(root.leftNode == null && root.rightNode == null){
			if( root.data == sum){
				System.out.println(path + "->" +root.data);
				return true;
			}
		}
		
		return findSum(root.leftNode , sum - root.data , path + "->" + root.data) || findSum(root.rightNode , sum - root.data,path + "->"  + root.data);
	}
}

class Node {
	int data;
	Node leftNode;
	Node rightNode;
	
	
	public Node(int data){
		this.data = data;
	}
}
