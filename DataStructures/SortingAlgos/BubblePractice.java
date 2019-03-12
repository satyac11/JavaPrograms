import java.util.Arrays;

public class BubblePractice {
	public static void bubbleSort(int []array) {
		for(int i=0;i<array.length-1;i++) {
			int temp =0;
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					temp = array[j+1];
					array[j+1]=array[j];
					array[j]=temp;					
				}
			}
		}
		System.out.println("After Sorting: "+Arrays.toString(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arry = {10,3,11,2,4,8,1,5};
		System.out.println("Before Sorting: "+Arrays.toString(arry));
		bubbleSort(arry);
	}

}
