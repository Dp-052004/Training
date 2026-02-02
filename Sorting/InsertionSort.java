package Sorting;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<=n-1;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {7,4,9,8,15,2};
		insertionSort(arr);
		System.out.println("After insertion sort");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
