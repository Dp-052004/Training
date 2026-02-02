package Searching;

import java.util.Arrays;

public class Linear {
	public static int linearSearch(int[] arr,int k) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,2,5,9,6,8};
		System.out.println(linearSearch(arr,4));
		System.out.println(linearSearch(arr,2));
		System.out.println(Arrays.binarySearch(arr, 2));
	}
}
