package com.ds.hash;

public class Element {
	int key;
	Object value;
	Element next;

	public Element getNext() {
		return next;
	}

	public void setNext(Element next) {
		this.next = next;
	}

	public Element() {
		next = null;
	}
	
	public Element(int key, Object value) {
		this.key = key;
		this.value = value;
		next = null;
	}
	
	public int getKey() {
		return key;
	}
	
	public Object getValue() {
		return value;
	}
	

}
