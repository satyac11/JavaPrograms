import java.util.Arrays;

public class InsertionSort {
	public static void sort(int []elements) {
		//int shift=0;
		for(int i=1;i<elements.length;i++) {
			int key = elements[i];
			int j=i;
			/*while(j>0) {
				if(key<elements[j-1]) {
					elements[j]=elements[j-1];	
					j--;
				}
				else {
					break;
				}
				
			}*/
			while(j>0 && key<elements[j-1]) {
				elements[j] = elements[j-1];
				j--;
			}
			elements[j]=key;
		}
	}

	public static void main(String[] args) {
		int []elements = {9,7,8,5,2,4,3,1,6};
		
		System.out.println("Before Sort: "+Arrays.toString(elements));
		sort(elements);
		System.out.println("After Sort: "+Arrays.toString(elements));
	}

}
