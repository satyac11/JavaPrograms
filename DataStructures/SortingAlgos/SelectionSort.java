import java.util.Arrays;

/**
 * 
 */

/**
 * @author satya
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 * In this program first we will find minimum index in the array and replace
	 * the elements
	 */
	
	static int i,j,min_index,temp;
	
	static void selectionSort(int []array) {
		
		for(int i=0;i<array.length-1;i++){//No need to sort last element
			min_index=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min_index])
					min_index=j;
			}
			
			if(min_index !=i) {
				temp = array[i];
				array[i] = array[min_index];
				array[min_index] = temp;
			}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {1,10,2,6,3,11,13,41};
		System.out.println("Before Sorting: "+Arrays.toString(array));
		selectionSort(array);
		System.out.println("After Sorting: "+Arrays.toString(array));

	}

}
