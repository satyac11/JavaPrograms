import java.util.Arrays;
import java.util.Scanner;

public class SwapStringChars {
	static String swapCharsWithPreDefinedMethods(String word) {
		StringBuilder updatedWord = new StringBuilder();
		updatedWord.append(word.charAt(word.length()-1));
		updatedWord.append(word.substring(1, word.length()-1));
		updatedWord.append(word.charAt(0));
		
		return updatedWord.toString();
	}
	
	static String swapWithoutPeDefMethods(String word) {
		//StringBuilder updatedWord = new StringBuilder();
		char[] arr = word.toCharArray();
		char firstChar=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(i == arr.length-1) {
				char temp;
				temp = arr[i];
				arr[i] =firstChar;
				firstChar = temp;
				
				arr[0]=firstChar;
			}				
		}
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []words = sc.nextLine().split(" ");
		for(String word:words) {
			System.out.println(swapWithoutPeDefMethods(word));
		}
	}

}
