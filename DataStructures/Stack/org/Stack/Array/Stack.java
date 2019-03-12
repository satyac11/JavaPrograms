package org.Stack.Array;

public class Stack<T> {
	Object [] array;
	int size;
	int top;

	public Stack(int size) {
		this.size = size;
		array = new Object[size];
		top=-1;
	}
	public boolean isFull() {
		return top == size-1;
	}
	public void push(Object data) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		array[++top] = data;		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		T item = (T)array[top];
		top = top-1;
		return item;
	}
	public void printStack() {
		while(top!=-1){
			System.out.println(array[top]+",");
			top = top-1;
		}
	}

}
