package org.Stack.DynamicArray;

public class StackWithDynamicArray {
	int top = -1;
	int capacity;
	int stack[];

	public StackWithDynamicArray(int capacity) {
		this.capacity = capacity;
		stack = new int[capacity];
	}

	public int size() {
		return (top + 1);
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public void push(int data) {
		if (size() == capacity)
			expand();
		stack[++top] = data;
	}

	public void expand() {
		int newLength = capacity << 1;
		int newStack[] = new int[newLength];
		System.arraycopy(stack, 0, newStack, 0, capacity);
		stack = newStack;
		this.capacity = newLength;
	}

	public void pop() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is under overflow");
		if (top < (capacity / 2))
			shrink();
		stack[top--] = Integer.MIN_VALUE;
	}

	public void shrink() {
		int newLength = capacity / 2;
		int newStack[] = new int[newLength];
		//System.arraycopy(stack, 0, newStack, 0, size());
		for(int i=0;i<newLength;i++)
			newStack[i] = stack[i];
		stack = newStack;
		top = stack.length-1;
		this.capacity = newLength;
	}
	
	public void reverseStack(int []stack) {
		int length=0;
		
		if(isEmpty())
			return;
		length = size();	
		if(length<top) {
			
		}
	}
	
	public String toString() {
		String s;
		s ="[";
		if(size()>0)
			s +=stack[0];
		if(size()>0)
			for(int i=1;i<size();i++) {
				s +=","+stack[i];
			}
		return s+"]";
			
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackWithDynamicArray cups = new StackWithDynamicArray(2);
		System.out.println(cups.size());
		cups.push(1);
		cups.push(2);
		cups.push(3);
		cups.push(4);
		cups.push(5);
		cups.push(6);
		cups.pop();
		cups.pop();
		cups.pop();
		cups.pop();

		System.out.println(cups.size());
		System.out.println(cups.toString());

	}

}
