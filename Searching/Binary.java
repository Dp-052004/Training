package Searching;

import java.util.ArrayList;

public class Binary {
	public static int binarySearch(int[] arr,int k) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==k) {
				return mid;
			}
			else if(arr[mid]<k) {
				low=mid+1;
			}
			else high=mid-1;
		}
		return -1;
	}
	
	
	public static int binarySearch(ArrayList<Integer> arr,int k) {
		int low=0,high=arr.size()-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr.get(mid)==k) {
				return mid;
			}
			else if(arr.get(mid)<k) {
				low=mid+1;
			}
			else high=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {3,5,6,7,9};
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(9);
		System.out.println(binarySearch(arr,3));
		System.out.println(binarySearch(arr,6));
		System.out.println(binarySearch(arr,2));
		
		
		System.out.println("ArrayList binary search");
		System.out.println(binarySearch(a,3));
		System.out.println(binarySearch(a,6));
	}
}
