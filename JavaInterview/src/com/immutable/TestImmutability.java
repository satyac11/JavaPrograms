package com.immutable;

public class TestImmutability {

	public static void main(String[] args) {
		ImmutableStudent obj1 = new ImmutableStudent(1,"satya");
		ImmutableStudent obj2 = new ImmutableStudent(1,"satya");
		ImmutableStudent obj3 = new ImmutableStudent(1,"c");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj1 == obj2);
	}

}
