package Dup;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int []array,int l,int r) {
		if(l<r) {
			int mid = r/2;
			merge(array,l,mid);
			merge(array,mid+1,r);
			sort(array,l,mid,r);
		}
	}
	
	public static void sort(int []array,int l,int mid, int r) {
		int n1=mid;
		int n2=r-mid;
		
		int[]L = new int[n1];
		int[]R = new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i]=array[i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=array[mid+j];
		}
		
		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
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
		while(i<n1) {
			array[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k]=L[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		int []array = {10,3,7,2,1,5,6,9,8,4};
		System.out.println("Array Before Sort: "+Arrays.toString(array));
		int l=0,r=array.length;
		merge(array,l,r);
		System.out.println("Array After Sort: "+Arrays.toString(array));

	}

}
