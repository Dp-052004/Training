package Sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr= {1,2,6,5,4,3,2,9,8};
		
		mergeSort(arr,0,arr.length-1);
		
	}
	
	public static void mergeSort(int[] arr,int start,int end) {
		if(start>=end) {
			return;
		}
		
		int mid=start+(end-start)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		
		merge(arr,start,mid,end);
	}
	
	public static void merge(int[] arr,int start,int mid,int end) {
		int m=mid-start+1;
		int n=end-mid;
		
		int[] arr1=new int[m];
		int[] arr2=new int[n];
		
		int[] arr3=new int[n+m];
		
		int i=0,j=0,k=0;
		
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				
			}
		}
	}
}
