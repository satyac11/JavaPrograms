package org.Stack.Array;

public class DictionaryStack {

	public static void main(String[] args) {
		Stack<String> words = new Stack(5);
		words.push("apple");
		words.push("banana");
		words.push("cat");
		words.push("dog");
		words.push("elephent");
		words.push("facebook");
		words.push("google");
		words.push("house");
		words.pop();
		words.printStack();
	}

}
