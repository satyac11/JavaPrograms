import java.util.Scanner;

/**
 * 
 */

/**
 * @author satya
 *
 */
public class ArrayManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long []array = new long[n];
        int a;
        int b;
        long k;
        /*for(int i=0;i<n;i++)
        	array[i]=0;*/
        
        for(int a0 = 0; a0 < m; a0++){
            a = in.nextInt();
            b = in.nextInt();
            k = in.nextInt();
            
            array[a-1]=array[a-1]+k;
            if(b<n)
            	array[b]=array[b]-k;
            
            /*for(int i=a-1;i<=b-1;i++)
                array[i]=array[i]+k;*/
        }
        long max=0;
        long temp=0;
        for(int j=0;j<n;j++){
            temp = temp+array[j];
            if(temp>max)
            	max=temp;
        }
        System.out.println(max);
        in.close();
    }

	

}
