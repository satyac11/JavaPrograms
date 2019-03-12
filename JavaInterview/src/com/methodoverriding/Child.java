package com.methodoverriding;

public class Child extends Parent {
	public void addMethod() {
		System.out.println("This is Child Class add method...");
	}
	
	static void dummyMethod() {
		System.out.println("This is Child Class Dummy Method...");
	}
	
	public static void main(String []args) {
		Parent p = new Child();
		p.dummyMethod();
		p.addMethod();
		Child ch = new Child();
		ch.addMethod();
		ch.dummyMethod();
	}
}
