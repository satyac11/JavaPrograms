package com.fibonaci;

import java.util.Scanner;

public class FibonaciWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements to print as fibonacci...");
		int n = sc.nextInt();
		if(n==1)
			System.out.println(0);
		else {
			int pointer1=0,pointer2=1,temp=0;
			System.out.print(pointer1+" "+pointer2+" ");
			for(int i=2;i<n;i++) {
				temp = pointer1+pointer2;
				pointer1=pointer2;
				pointer2 = temp;
				System.out.print(temp+" ");
			}
			
		}
			

	}

}
