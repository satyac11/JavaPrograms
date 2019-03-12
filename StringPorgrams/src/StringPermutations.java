import java.util.Scanner;

public class StringPermutations {
	
	private static void permutations(String data) {
		permutation("",data);
	}
	
	private static void permutation(String perm,String data) {
		if(data.isEmpty())
			System.out.println(perm+data);
		for(int i =0;i<data.length();i++) {
			permutation(perm+data.charAt(i),data.substring(0, i)+data.substring(i+1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String data = sc.next();
		
		permutations(data);

	}

}
