import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxPossibleTime {
	public static String getMaxTime(int A,int B,int C,int D) {
		List<Integer> digits = Arrays.asList(A,B,C,D);
		int h1,h2,m1,m2;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i;j++) {
				if(i==0) {
					if(digits.contains(2)) {
						h1=2;
						digits.remove(digits.indexOf(2));
					}
					else if(digits.contains(1)) {
						h1=1;
						digits.remove(digits.indexOf(1));
					}
					else if(digits.contains(0)) {
						h1=1;
						digits.remove(digits.indexOf(1));
					}
					else
						return null;
				}
				
			}
		}
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		String time = getMaxTime(A,B,C,D);
		System.out.println("Max Possible Time is: "+time);
	}

}
