package Sorting;

import java.util.Arrays;


//2 3 4 5 7 8 12
public class KLargestSmallest {
	public static int Klargest(int[] arr,int k) {
		int n=arr.length;
		Arrays.sort(arr);
		return arr[n-k];
	}
	
	public static int Ksmallest(int[] arr,int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	public static void main(String[] args) {
		int[] arr= {8,3,2,7,4,12,5};
		System.out.println(Klargest(arr,3));
		System.out.println(Ksmallest(arr,3));
	}
}
