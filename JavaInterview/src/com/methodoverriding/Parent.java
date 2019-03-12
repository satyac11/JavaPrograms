package com.methodoverriding;

public class Parent {
	int Parent(){
		return 0;
	}
   public void addMethod() {
	   System.out.println("This is parent class add method");
   }
   static void dummyMethod() {
	   System.out.println("This is parent dummy method");
   }
}
