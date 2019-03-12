package com.palindrome;

import java.util.Scanner;

public class IntegerPalindrome {
	
	public static boolean isPalindrome(int number) {
		int reverse=0,remainder,originalvalue=number;
		
		if(number==0)
			return false;
		
		while(number>0) {
			remainder = number%10;
			reverse = reverse*10+remainder;
			number = number/10;			
		}
		System.out.println("reversed value is: "+reverse);
		if(originalvalue==reverse)
			return true;
		else
			return false;
	}
	
	static boolean isArmStrong(int number) {
		int cubeOfDigits=0,originalValue=number,remainder;
		while(number>0) {
			remainder = number%10;
			//sumOfDigits = remainder+sumOfDigits;
			cubeOfDigits = cubeOfDigits +(remainder*remainder*remainder);
			number = number/10;
		}
		if(originalValue == cubeOfDigits)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		/*boolean status = isPalindrome(n);
		if(status)
			System.out.printf("%d is a palindrome",n);
		else
			System.out.printf("%d is not a palindrome",n);
*/		
		if(isArmStrong(n))
			System.out.printf("%d is armstrong number",n);
		else
			System.out.printf("%d is not a armstrong number",n);

	}

}
