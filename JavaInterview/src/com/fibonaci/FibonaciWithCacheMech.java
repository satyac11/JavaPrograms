package com.fibonaci;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonaciWithCacheMech {
	static Map<Integer, Integer> cache = new HashMap<>();

	static int getFibonaci(int number) {
		if (cache.containsKey(number))
			return cache.get(number);
		
		int fib = getFebValue(number);
		cache.put(number, fib);
		return fib;

	}

	static int getFebValue(int number) {
		if (number == 1 || number == 2) {			
			return 1;
		}
		return getFibonaci(number - 1) + getFibonaci(number - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		final long startTime = System.currentTimeMillis();
		// System.out.println("Starting time: "+startTime);
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d ",getFibonaci(i));
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("\nEnding Time: " + (endTime - startTime));

	}

}
