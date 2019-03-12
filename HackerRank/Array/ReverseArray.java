import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=array.length-1;i>=0;i--){
            System.out.printf("%d ",array[i]);
        }
    }
}
