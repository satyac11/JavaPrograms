package Fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Fibo {
	public static void fibonaci(int n) {
		if(n<0)
			throw new IllegalArgumentException("n must not be less than zero");
		if(n==0)
			System.out.println(0);
		if(n==1)
			System.out.printf("%d %d ",0,1);
		int temp =0,n1=0,n2=1;
		System.out.printf("%d %d ",n1,n2);
		for(int i=2;i<n;i++)
		{
			temp = n1+n2;
			n1=n2;
			n2=temp;
			System.out.printf(" %d ",temp);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ip);
		System.out.println("Enter a value: ");
		int n =Integer.valueOf(br.readLine()) ;
		//Calendar cal = Calendar.getInstance();
		
		System.out.println("Execution started at "+System.nanoTime());
		fibonaci(n);
		System.out.println("\nExecution stoped at "+System.nanoTime());

	}

}
