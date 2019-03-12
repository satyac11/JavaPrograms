package org.SingleLinkedList;

public class LinkedList {
	private static ListNode headNode;
	private static int length =0;
	private  static void insertNodeAtBegining(ListNode newNode) {
		if(headNode == null)
			headNode = newNode;
		else {
			newNode.setNext(headNode);
			headNode = newNode;
		}			
	}
	private static void insertNodeAtEnd(ListNode newNode) {
		ListNode prevNode = null;
		ListNode pointer = headNode;
		while(pointer!=null){
			prevNode = pointer;
			pointer = pointer.getNext();			
		}
		prevNode.setNext(newNode);
	}
	private static void insertNodeAtMiddle(ListNode newNode) {
		ListNode midPointer = headNode;
		ListNode pointer = headNode;
		if(headNode !=null) {
			while (pointer.getNext() != null && midPointer != null) {
				midPointer = midPointer.getNext();
				pointer = pointer.getNext().getNext();
			}
		}		
		newNode.setNext(midPointer.getNext());
		midPointer.setNext(newNode);
		
	}
	private static void insertNodeAtPosition(ListNode newNode,int index) {
		/*if(index<0)
			index=0;
		else if(index>length)
			index=length;*/
		
		if(headNode == null ) {
			headNode = newNode;
		}
		else if(index ==0) {
			newNode.setNext(headNode);
			headNode = newNode;
		}
		else {
			ListNode positionNode = headNode;
			for(int i=1;i<index;i++) {
				positionNode = positionNode.getNext();
			}
			newNode.setNext(positionNode.getNext());
			positionNode.setNext(newNode);
		}
	}
	private static void deleteNodeAtBegining() {
		ListNode tempNode = headNode;
		if(headNode != null) {			
			headNode = headNode.getNext();
			tempNode.setNext(null);
		}
	}
	private static void deleteNodeAtEnd() {		
		if(headNode != null) {
			ListNode prevNode = headNode;
			ListNode lastNode = headNode;
			while(lastNode.getNext() != null) {
				prevNode = lastNode;
				lastNode = lastNode.getNext();
			}
			prevNode.setNext(null);
		}
		
	}
	private static void deleteNodeAtMiddle() {
		if(headNode != null) {
			ListNode fastNode = headNode;
			ListNode slowNode = headNode;
			while(fastNode.getNext() != null) {
				slowNode = slowNode.getNext();
				fastNode = fastNode.getNext().getNext();
			}
			ListNode tempNode = slowNode.getNext();
			slowNode.setNext(tempNode.getNext());
			tempNode.setNext(null);
			
			
		}
	}
	private static void deleteNodeAtPosition(int index) {
		ListNode prevNode = headNode;
		ListNode pointer = headNode;
		if(headNode != null) {
			for(int i=1;i<index;i++) {
				prevNode = pointer;
				pointer = pointer.getNext();
			}
			prevNode.setNext(pointer.getNext());
			pointer.setNext(null);
		}
	}
	

	public static void main(String[] args) {		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		
		headNode = node1;
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(null);
		//Inserting Nodes in linked list
		insertNodeAtBegining(new ListNode(0));
		insertNodeAtEnd(new ListNode(5));
		insertNodeAtEnd(new ListNode(6));
		insertNodeAtMiddle(new ListNode(7));
		insertNodeAtPosition(new ListNode(10), 2);
		
		//Deleting nodes from LinkedList
		deleteNodeAtBegining();
		deleteNodeAtEnd();
		deleteNodeAtMiddle();
		deleteNodeAtPosition(2);
		
		while(headNode !=null) {
			System.out.println(headNode.getData());
			headNode = headNode.getNext();
			length++;
		}
		System.out.println("Length of Linked list is : "+length);
	}

}
