package org.Stack.Problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SymbolBalancing {
	int top = -1;
	int capacity;
	char[] symbols;

	public SymbolBalancing(int capacity) {
		this.capacity = capacity;
		symbols = new char[capacity];
	}

	public boolean isStackEmpty() {
		return top < 0;
	}

	public int size() {
		return top + 1;
	}

	public void push(char data) throws Exception {
		if (size() == capacity)
			throw new Exception("Stack is OverFlow");
		symbols[++top] = data;
	}

	public void pop() throws Exception {
		if (isStackEmpty())
			throw new Exception("Stack is UnderFlow");
		symbols[top--] = Character.MIN_VALUE;
	}

	public boolean isBalanced(String input) throws Exception {
		String temp = input;
		if (temp == null || temp.length() == 0)
			return true;

		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ')') {
				if (isStackEmpty())
					return false;
				pop();
			} else if (temp.charAt(i) == ']') {
				if (isStackEmpty())
					return false;
				pop();
			} else if (temp.charAt(i) == '}') {
				if (isStackEmpty())
					return false;
				pop();
			} else {
				if (temp.charAt(i) == '(' || temp.charAt(i) == '[' || temp.charAt(i) == '{') {
					push(temp.charAt(i));
				}
			}

		}

		if (isStackEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws Exception {
		SymbolBalancing objSymbols = new SymbolBalancing(10);
		System.out.println("Entery Input: ");
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println("Does Given Input is Balanced: " + objSymbols.isBalanced(input));
		sc.close();

	}

}
