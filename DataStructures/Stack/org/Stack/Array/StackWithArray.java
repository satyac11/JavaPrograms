package org.Stack.Array;

public class StackWithArray {
	int capacity;
	int top =-1;
	int []stack;
	int CAPCITY=5;
	
	/*StackWithArray(){
		this(CAPCITY);//setting initial capacity of stack
	}*/
	StackWithArray(int cap) {
		this.capacity = cap;
		stack = new int[capacity];
	}
	public boolean isEmpty() {
		return(top<0);
	}
	public int size() {
		return top+1;
	}
	public int top()throws Exception {
		if(isEmpty())
			throw new Exception("Stack is Full");
		return stack[top];			
	}
	
	public void push(int data)throws Exception {
		if(size()<capacity) {
			stack[++top]=data;
		}
		else
			throw new Exception("Stack is Full");
	}
	
	public void pop() throws Exception{
		if(top>0) {
			stack[top--]=Integer.MIN_VALUE;
		}
		else 
			throw new Exception("Stack is Empty");
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
		StackWithArray plates = new StackWithArray(10);
		plates.push(1);
		plates.push(2);
		plates.push(3);
		plates.push(4);
		plates.push(5);
		plates.push(6);
		plates.pop();
		System.out.println(plates.size());
		System.out.println(plates.toString());

	}

}
