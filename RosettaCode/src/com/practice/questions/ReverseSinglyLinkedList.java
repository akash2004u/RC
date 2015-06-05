package com.practice.questions;

public class ReverseSinglyLinkedList {

	public static void main(String... args){
		ListNode root;
		ListNode node = new ListNode(1);
		root =node;
		node = push(node,2);
		node = push(node,3);
		node = push(node,4);
		node = push(node,5);
		node = push(node,6);

		System.out.println(root);
		root = reverseList(root);
		
		System.out.println("REverse:"+reverseList(root));

	}

	private static ListNode push(ListNode node,int val) {
		node.next = new ListNode(val);
		return node.next;
	}

	static ListNode reverseList(ListNode head) {
		System.out.println("Called IWth "+head);
		if(head == null){
			System.out.println("Return :"+head);
			return head;
		}
		
		ListNode val = (head.next == null) ? head : reverseList(head.next);
		
		System.out.println("HEad :"+head);
		System.out.println("Val :"+val);
		
		val.next = head;
		head.next = null;
		
		return val;
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }

	public String toString(){
		return "("+val+") ->"+next;
	}
}
