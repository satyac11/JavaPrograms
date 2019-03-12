import java.util.Scanner;

public class RotateElement {/*
	public static int [] leftRotate(int []array,int s) {
		for(int i=0;i<s;i++) {
			leftRotateByOneElement(array);
		}
		return array;
	}
	
	public static void leftRotateByOneElement(int []array) {
		int i, temp =0;
		temp = array[0];
		for(i=0;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		array[i]=temp;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int leftShifts = sc.nextInt();
		int []array = new int[size];;
		
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		
		array = leftRotate(array,leftShifts);
		
		for(int i=0;i<array.length;i++) {
			System.out.printf("%d ", array[i]);
		}		
		System.arr
	}
	

*/
	public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int len = myScanner.nextInt();
        int offset = myScanner.nextInt();
        int [] arr = new int [len];
        int ptr = (offset*-1) + len;
        for(int i = 0; i<len; i++){
            arr[ptr++] = myScanner.nextInt();
            if(ptr==len) ptr = 0;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        myScanner.close();
    }	
}
