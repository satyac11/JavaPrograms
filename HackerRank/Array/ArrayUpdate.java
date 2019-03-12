import java.util.Scanner;

/**
 * 
 */

/**
 * @author satya
 *
 */
public class ArrayUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i=0;i<testCases;i++) {
			int size = sc.nextInt();
			int k = sc.nextInt();
			int []array = new int[size];;
			
			for(int a=0;a<size;a++)
				array[a]=sc.nextInt();
			
			int min=array[0];
			for(int j=1;j<array.length;j++) {
				if(array[j]<min) {
					min = array[j];
				}
			}
			if(k==min || k<min) {
				System.out.println(0);
			}
			else {
				System.out.println(k-min);	
			}
		}			

	}

}
