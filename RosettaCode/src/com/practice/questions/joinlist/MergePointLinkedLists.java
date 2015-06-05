package com.practice.questions.joinlist;

public class MergePointLinkedLists {

	public static void main(String... args){

		Node node1 = new Node("1");
		Node root1 = node1;
		node1 = push(node1,"2");
		node1 = push(node1,"3");
		
		Node mergeNode = push(node1,"4");
		node1 = mergeNode;
		node1 = push(node1,"5");
		
		System.out.println(root1);
		
		Node node2 = new Node("A");
		Node root2 = node2;
		
		node2 = push(node2,"b");
		node2 = push(node2,"c");
		
		node2.next = mergeNode;
		node2 = mergeNode;
		
		System.out.println(root2);
		
		System.out.println(findMerge(root1,root2));
		
	}

	static Node findMerge(Node list1,Node list2){
		
		while(list1.next != null) {
			Node node = list1;
			list1 = list1.next;
			
			node.next = null;
		}
		
		while(list2.next != null) {
			list2 = list2.next;
		}
		
		return list2;
	}
	
	static Node push(Node root,String val){
		Node newNode = new Node(val);
		root.next = newNode;
		
		return newNode;
	}
	
}


class Node {
	String data;
	Node next;

	public Node(String data){
		this.data = data;
	}
	
	public String toString(){
		return this.data + "->"+this.next;
	}
}
