package Searching;

import java.util.Arrays;

public class Peak {
	public static int findPeak(int[] arr) {
		int n=arr.length;
		if(arr[0]>arr[1]) return 0;
		if(arr[n-1]>arr[n-2]) return n-1;
		
		int low=1,high=n-2;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return arr[mid];
			else if(arr[mid]>arr[mid+1]) {
				high=mid-1;
			}
			else low=mid+1;
		}
		return arr[low];
	}
	
	public static void main(String[] args) {
		int[] arr= {2,4,8,6,5,4,3,1};
		System.out.print("The peak element is:");
		System.out.println(findPeak(arr));
	}
}
