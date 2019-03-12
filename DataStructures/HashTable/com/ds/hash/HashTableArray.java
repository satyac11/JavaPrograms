package com.ds.hash;

import java.util.Arrays;

public class HashTableArray<T> {
	Element[] elements;

	public HashTableArray(int size) {
		elements = new Element[size];
		for (int i = 0; i < size; i++) {
			elements[i] = new Element();
		}
	}

	public int getHash(int key) {
		return key % elements.length;
	}

	public void put(int key, Object value) {
		int hashIndex = getHash(key);
		Element elementAtArrayIndex = elements[hashIndex];
		Element newElement = new Element(key, value);
		if (elementAtArrayIndex != null) {
			newElement.next = elementAtArrayIndex.next;
			elementAtArrayIndex.next = newElement;
		} else {
			elementAtArrayIndex = newElement;
		}
	}

	public T getValue(int key) {
		int hashIndex = getHash(key);
		String values = "";
		Element elementAtArrayIndex = elements[hashIndex];
		while (elementAtArrayIndex != null) {
			if (elementAtArrayIndex.getKey() == key) {
				values = values+elementAtArrayIndex.getValue()+",";				
			}
			elementAtArrayIndex = elementAtArrayIndex.next;
		}
		return (T) values;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HashTableArray [elements=").append(Arrays.deepToString(elements)).append("]");
		return builder.toString();
	}
	public void printElementsData() {
		if(elements.length>0) {
			for(int i=0;i<elements.length;i++) {
				Element elem = elements[i];
				Element pointer = elem;
				while(pointer!=null) {
					System.out.printf("Key: %d and Value:%s \n",pointer.getKey(),pointer.getValue());
					pointer = pointer.getNext();
				}
			}
		}
	}

}
