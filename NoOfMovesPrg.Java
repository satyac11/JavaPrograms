import java.util.Arrays;
import java.util.Scanner;

public class NoOfMovesPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int alength = sc.nextInt();
		int []A = new int[alength];
		for(int i=0;i<A.length;i++) {
			A[i]= sc.nextInt();
		}
		
		int mlen = sc.nextInt();
		int []M = new int[mlen];
		for(int j=0;j<M.length;j++) {
			M[j]= sc.nextInt();
		}
		
		System.out.println("A: "+Arrays.toString(A));
		System.out.println("M: "+Arrays.toString(M));
		
		int total = getTotalMoves(A,M);
		System.out.println("Total No of moves required: "+total);

	}
	
	private static int getTotalMoves(int []A,int []M) {
		int moves =0;
		for(int i =0;i<A.length;i++) {
			moves = moves+getNoOfMoves(A[i],M[i]);
		}
		return moves;
	}
	
	private static int getNoOfMoves(int a, int m) {
		int n =0;
		String v1 = String.valueOf(a);
		String v2 = String.valueOf(m);
		for(int i =0;i<v1.length();i++) {
			int ch1 = Character.getNumericValue(v1.charAt(i));
			int ch2 = Character.getNumericValue(v2.charAt(i));
			n = n+Math.abs(ch1-ch2);
			
		}
		return n;
	}

}
