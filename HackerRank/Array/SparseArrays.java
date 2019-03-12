import java.util.Scanner;

/**
 * 
 */

/**
 * @author satya
 *
 */
public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String []array = new String[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.next();
		}
		int query = sc.nextInt();
		for(int i=0;i<query;i++) {
			String search = sc.next();
			int count =0;
			for(int j=0;j<n;j++) {
				if(array[j].equals(search)) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
