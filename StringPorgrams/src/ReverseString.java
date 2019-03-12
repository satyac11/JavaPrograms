import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
	
	public static void reverseStringUsingLoops(String data) {
		StringBuilder string = new StringBuilder();
		for(int i=data.length()-1;i>=0;i--) {
			string.append(data.charAt(i));
		}
		System.out.println("Reversed String is: "+string.toString());
	}
	
	public static void reverseStringUsingStack(String data) {
		StringBuilder string = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<data.length();i++) {
			stack.push(data.charAt(i));
		}
		while(!stack.isEmpty()) {
			string.append(stack.pop());
		}
		System.out.println("Reversed String is: "+string.toString());
	}
	
	public static void reverseUsingSwapping(String data) {
		char []array = data.toCharArray();
		int left=0,right=array.length-1;
		for(left=0;left<right;left++,right--) {
			char temp = array[left];
			array[left]=array[right];
			array[right]=temp;
		}
		System.out.println("Reversed Array is: "+Arrays.toString(array));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		System.out.println("Using Loops: ");
		reverseStringUsingLoops(data);
		System.out.println("Using Stack: ");
		reverseStringUsingStack(data);
		System.out.println("Using Swap: ");
		reverseUsingSwapping(data);

	}

}
