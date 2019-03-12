package com.constructor;

public class Animal {
	String name="";
	Animal(){
		System.out.println("This is default constructor.......");
	}
	Animal(String name){
		this.name = name;
		System.out.println("This is parameter constructor...........");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal();
	}

}
