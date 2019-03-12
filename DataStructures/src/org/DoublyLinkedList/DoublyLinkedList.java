package org.DoublyLinkedList;

public class DoublyLinkedList {
	DllNode headNode;
	int length = 0;

	private void push(int data) {
		DllNode newNode = new DllNode(data);

		newNode.setNext(headNode);
		newNode.setPrev(null);

		if (headNode != null)
			headNode.setPrev(newNode);
		headNode = newNode;

		/*
		 * if(headNode != null) { //headNode.setNext(null); newNode.setPrev(null);
		 * newNode.setNext(headNode); headNode.setPrev(newNode);
		 * 
		 * headNode = newNode; } else headNode = newNode;
		 */
		length++;
	}
	
	private void append(int data) {
		DllNode newNode = new DllNode(data);
		DllNode lastNode = headNode;

		newNode.setNext(null);

		if (headNode == null) {
			newNode.setPrev(null);
			newNode.setNext(null);
			headNode = newNode;
		}

		while (lastNode.getNext() != null)
			lastNode = lastNode.getNext();

		lastNode.setNext(newNode);
		newNode.setPrev(lastNode);

		length++;

	}

	private void printElements() {
		DllNode pointerNode = headNode;
		while (pointerNode != null) {
			System.out.println(pointerNode.getData());
			pointerNode = pointerNode.getNext();
		}
	}
	private void pop() {		
		headNode = headNode.getNext();
		headNode.setPrev(null);		
	}
	private void deleteNode(int data) {
		/*//DllNode removeNode = new DllNode(data);
		DllNode pointerNode;
		
		if(headNode != null && headNode.getData() == data) {
			headNode = headNode.getNext();
			headNode.setPrev(null);
		}
		
		pointerNode = headNode.getNext();
		
		while(pointerNode.getNext() != null && pointerNode.getPrev() != null) {
			if(pointerNode.getData() == data) {
				DllNode prevNode = pointerNode.getPrev();
				DllNode nextNode = pointerNode.getNext();
				
				prevNode.setNext(pointerNode.getNext());
				nextNode.setPrev(pointerNode.getPrev());
			}
			pointerNode = pointerNode.getNext();
				
		}*/
		
		DllNode removeNode=headNode;
		while(removeNode.getNext() != null) {
			if(removeNode.getData() == data) 
				break;
			else
				removeNode = removeNode.getNext();
		}
		
		if(headNode == null) {
			return;
		}
		if(headNode == removeNode) {
			headNode = headNode.getNext();
			length--;
		}
		
		if(removeNode.getNext() != null) {
			removeNode.getNext().setPrev(removeNode.getPrev());
			length--;
		}
		if(removeNode.getPrev() != null) {
			removeNode.getPrev().setNext(removeNode.getNext());
			length--;
		}
		
		return;
	}
	
	private int length() {
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.push(2);
		list.push(3);
		list.push(4);
		list.append(1);
		//list.pop();
		list.deleteNode(1);
		
		list.printElements();
		System.out.println("Total Number of Elements in DLL is: "+list.length());
	}

}
