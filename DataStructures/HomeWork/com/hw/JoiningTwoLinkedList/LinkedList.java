package com.hw.JoiningTwoLinkedList;

public class LinkedList<T> {
	Node head;
	Node [] nodes;
	
	public LinkedList() {
		nodes = new Node[0];
		head = null;
	}
	
	public void push(Object data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public T pop() {
		if(head == null)
			return null;
		Object itemData = head.getData();
		Node temp = head.next;
		head = temp;
		return (T) itemData;
	}
	
	public int length() {
		int length=0;
		Node pointer=head;
		while(pointer != null) {
			length++;
			pointer = pointer.next;
		}
		return length;
	}

}
