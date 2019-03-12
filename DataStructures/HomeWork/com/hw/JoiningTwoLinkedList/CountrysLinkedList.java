package com.hw.JoiningTwoLinkedList;

import org.Stack.Array.Stack;

public class CountrysLinkedList {

	public static void main(String[] args) {
		int [] array;
		int top =0;
		LinkedList<Integer> list1 = new LinkedList();
		LinkedList<Integer> list2 = new LinkedList();
		LinkedList<Integer> list3 = new LinkedList();
		
		Stack<Integer> stack ;
		
		/*LinkedList<String> countrys = new LinkedList();
		countrys.push("India");
		countrys.push("China");
		countrys.push("Bangladesh");*/
		
		
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(4);
		list1.push(5);	
		
		
		list2.push(6);
		list2.push(7);
		list2.push(8);
		list2.push(9);
		
		//array = new int[list2.length()];//Creating stack with list2 size
		Node ptr = list2.head;
		stack = new Stack(list2.length());
		
		/*for(int i=0;i<list2.length();i++) {//Storing list2 values to stack
			top = top+1;
			array[i]=(int)ptr.getData();			
			ptr = ptr.next;
		}
		
		for(int i=0;i<array.length;i++) {//Printing the stack element
			System.out.println(array[i]);
		}*/
		while(ptr!=null) {
			stack.push(ptr.getData());
			ptr = ptr.next;
		}
		
		int size = list1.length();
		Node pointer= list1.head;
		
		while(size>0) {
			if(pointer != null) {
				list3.push(pointer.getData());
				pointer = pointer.next;
			}
			if(!stack.isEmpty()) {
				/*list3.push(array[top-1]);
				top = top-1;*/
				list3.push(stack.pop());
			}
			size--;
		}
		
		/*LinkedList<Integer> list2 = new LinkedList();
		list2.push(6);
		list2.push(7);
		list2.push(8);
		list2.push(9);
		
		array = new int[list2.length()];
		
		for(int i=0;i<list2.length();i++) {
			array[i]=(int)list2.head.getData();
			top = top+1;
			list2.head = list2.head.next;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}*/
		
		
		
		Node list3Pointer = list3.head;
		
		while(list3Pointer != null) {
			System.out.println(list3Pointer.getData()+" ");
			list3Pointer =list3Pointer.next;
		}
		System.out.println("Size is: "+list3.length());
	}

}
