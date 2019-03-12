import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
	static int temp =0;
	
	
	public static void sortElements(int array[] ) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<(array.length-i-1);j++) {
				if(array[j]>array[j+1]) {//will move large value to end of the array
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int []array = {2,12,3,34,4,6,7,5,65};
		System.out.println("Befor Sorting: "+Arrays.toString(array));
		sortElements(array);
		System.out.println("After Sorting: "+Arrays.toString(array));
	}

}
