package com.palindrome;

import java.util.Scanner;

public class PalindromProgram {
	
	static boolean isPalindrome(String data) {
		StringBuffer reverse = new StringBuffer();
		if(data == null)
			System.out.println("Enter valid data");
		for(int i=data.length()-1;i>=0;i--) {
			reverse.append(data.charAt(i));
		}
		System.out.println("Reversed string: "+reverse.toString());
		if(data.equals(reverse.toString()))
			return true;
		else
			return false;
					
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome: ");
		String value = sc.next();
		boolean status = isPalindrome(value);
		if(status)
			System.out.println(value+" is Palindrome");
		else
			System.out.println(value+" is not palindrome");
	}

}
