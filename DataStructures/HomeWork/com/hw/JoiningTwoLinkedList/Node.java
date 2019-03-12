package com.hw.JoiningTwoLinkedList;

public class Node {
	Object data;
	Node next;

	public Node() {
		next = null;
	}
	
	public Node(Object data) {
		this.data = data;
		next = null;
	}
	
	public Object getData() {
		return data;
	}

}
