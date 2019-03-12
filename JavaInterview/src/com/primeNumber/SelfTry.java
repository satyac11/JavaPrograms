package com.primeNumber;

import java.util.Scanner;

public class SelfTry {
	
	static boolean isPrimeNumber(int number) {
		//int count =1;
		if(number<=1)
			return false;
		
		for(int i=2;i<Math.sqrt(number);i++) {
			if(number%i==0) {
				System.out.println("Divided by:"+ i);
				return false;
			}
		}		
					
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not: ");
		int n = sc.nextInt();
		long startTime = System.currentTimeMillis();
		boolean status = isPrimeNumber(n);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time has taken to run the program is: "+(endTime-startTime));
		if(status)
			System.out.println("The given number is prime number");
		else
			System.out.println("The given number is not a prime number");
		
	}

}
