package com.palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeRecursiveProgram {
	static StringBuffer outPut = new StringBuffer();
	static String inPut;
	static String reverseString(int number) {
		if(number==0) {
			outPut.append(inPut.charAt(number));
			return outPut.toString();
		}
		outPut.append(inPut.charAt(number));
		return reverseString(number-1);
	}

	static boolean isPalindrome(String data) {
		if(data == null)
			return false;
		inPut = data;
		String reverse = reverseString(data.length()-1);
		
		if(data.equals(reverse))
			return true;
		else
			return false;
	}
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome: ");
		String value = sc.next();
		boolean status = isPalindrome(value);
		if(status)
			System.out.println(value+" is Palindrome");
		else
			System.out.println(value+" is not palindrome");
	}*/
	
	@Test
	public void testPalindrome() {
		assertTrue(isPalindrome("mom"));
		assertFalse(isPalindrome("satya"));
	}
	

}
