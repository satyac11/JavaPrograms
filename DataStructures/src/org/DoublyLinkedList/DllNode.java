package org.DoublyLinkedList;

public class DllNode {
	private int data;
	DllNode prev;
	DllNode next;
	
	DllNode(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DllNode getPrev() {
		return prev;
	}

	public void setPrev(DllNode prev) {
		this.prev = prev;
	}

	public DllNode getNext() {
		return next;
	}

	public void setNext(DllNode next) {
		this.next = next;
	}
	
}
