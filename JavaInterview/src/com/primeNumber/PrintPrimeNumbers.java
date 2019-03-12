package com.primeNumber;

import java.util.Scanner;

public class PrintPrimeNumbers {
	
	static boolean isPrimeNumber(int number) {
		if(number<1)
			return false;
		else if(number==2 ||number==3)
			return true;
		for(int j=2;j<=Math.sqrt(number);j++) {
			if(number%j==0)
				return false;
		}
		return true;
	}
	
	static void printPrimeNumbers(int number) {
		System.out.println("Prime Numbers: ");
		for(int i=1;i<number;i++) {
			if(isPrimeNumber(i))
				System.out.printf("%d ",i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		printPrimeNumbers(n);
	}

}
