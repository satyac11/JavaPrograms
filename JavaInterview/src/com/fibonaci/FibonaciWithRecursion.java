package com.fibonaci;

import java.util.Scanner;

public class FibonaciWithRecursion {
	
	public static int getFibonaci(int number) {
		if(number == 1 || number ==2) {			
			return 1 ;
		}
		
		return getFibonaci(number-1)+getFibonaci(number-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		final long startTime = System.currentTimeMillis();
		//System.out.println("Starting time: "+startTime);
		for(int i=1;i<=n;i++) {
			System.out.println(getFibonaci(i)+" ");
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Ending Time: "+(endTime-startTime));
	}

}
