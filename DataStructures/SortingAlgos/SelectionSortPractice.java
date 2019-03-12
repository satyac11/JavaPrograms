import java.util.Arrays;

public class SelectionSortPractice {
	static int min=0;
	public static void selctionSortElements(int []array) {
		for(int i=0;i<array.length-1;i++) {
			min = array[i];
			for (int j=i+1;j<array.length;j++) {
				if(min<array[j]) {
					min=array[j];					
				}
				if(min !=array[i]) {
					int temp = array[i];
					array[i] = min;
					
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int []array = {2,12,3,34,4,6,7,5,65};
		System.out.println("Before Sorting: "+Arrays.toString(array));
		selctionSortElements(array);
		System.out.println("After Sorting: "+Arrays.toString(array));
	}

}
