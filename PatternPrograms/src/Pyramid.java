import java.util.Scanner;
import java.util.Stack;

public class Pyramid {
	
	public static void printPyramid(int n) {		
		int count=0;
		
		for(int i=1;i<=n;i++) {
			Stack<Integer> st = new Stack<Integer>();
			StringBuilder line = new StringBuilder();
			for(int j=1;j<=i;j++) {
				count = count+1;
				st.push(count);
			}
			while(!st.isEmpty()) {
				line.append(st.pop()+"*");
			}
			removeAsterickAtEnd(line.toString());
			System.out.println("");
		}
	}
	
	public static void removeAsterickAtEnd(String data) {
		if(data.charAt(data.length()-1)=='*') {
			if(!(data.length() ==2))
				data = data.substring(0, data.length()-1);
			else
				data = data.substring(0,1);
		}
		System.out.print(data);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int n = sc.nextInt();
		
		printPyramid(n);

	}

}
