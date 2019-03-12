import java.util.Arrays;

public class MergeSortProgram {
	public static void mergeSort(int []array) {
		int n = array.length;
		if(n<2)
			return;
		int mid =n/2;
		int L[] = new int[mid];
		int R[] = new int[n-mid];
		
		for(int i=0;i<mid;i++) {
			L[i]=array[i];
		}
		for(int j=mid;j<n;j++) {
			R[j-mid]=array[j];
		}
		
		mergeSort(L);
		mergeSort(R);
		merge(array,L,R);
	}
	public static void merge(int []array,int[]L,int[]R) {
		int leftCount = L.length;
		int rightCount = R.length;
		int i=0,j=0,k=0;
		
		while(i<leftCount && j<rightCount) {
			if(L[i]<=R[j]) {
				array[k]=L[i];
				i++;
			}
			else {
				array[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<leftCount) {
			array[k]=L[i];
			i++;
			k++;
		}
		while(j<rightCount) {
			array[k]=R[j];
			j++;
			k++;
		}
		
		
	}
	public static void main(String[] args) {
		int []array = {10,3,7,2,1,5,6,9,8,4};
		System.out.println("Array Before Sort: "+Arrays.toString(array));
		mergeSort(array);
		System.out.println("Array After Sort: "+Arrays.toString(array));

	}

}
