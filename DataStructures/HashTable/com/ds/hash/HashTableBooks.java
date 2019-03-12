package com.ds.hash;

public class HashTableBooks {

	public static void main(String[] args) {
		HashTableArray<String> books = new HashTableArray<String>(10);
		books.put(10, "DS");
		books.put(11, "Indian Politics");
		books.put(10, "Effective Java");
		books.put(11, "Indian History");
		System.out.println(books.getValue(10));
		System.out.println(books.getValue(11));
		books.printElementsData();
	}

}
