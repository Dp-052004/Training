package Sorting;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<=n-2;i++) {
			int mini=i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[mini]) mini=j;
			}
			int temp=arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5,6,2,9,8,1,0};
		selectionSort(arr);
		System.out.println("After Selection sort");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
