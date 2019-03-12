import java.util.Scanner;

public class FizzBuzz {
	public static String getMessage(int divisor,int n, String msg) {
		return n%divisor == 0 ?msg : "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			/*if(i%3==0 && i%5==0)
				System.out.println(i+"-----FizzBuzz");
			else if(i%3==0)
				System.out.println(i+"-------Fizz");
			else if(i%5==0)
				System.out.println(i+"-------Buzz");*/
			String word = getMessage(3,i,"Fizz")+getMessage(5,i,"Buzz");
			if(!word.isEmpty())
				System.out.println(i+"===="+word);
		}
		
		sc.close();
	}

}
