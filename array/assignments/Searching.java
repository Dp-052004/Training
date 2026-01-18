package array_assgn;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	public static void linear(int[] arr,int n) {
		System.out.println("LINEAR SEARCH");
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(n+" found at index:"+i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println(n+" not found");
		}
	}
	
	public static void binary(int[] arr,int n) {
		System.out.println("BINARY SEARCH");
		Arrays.sort(arr);
		boolean found=false;
		
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==n) {
				System.out.println(n+" found at index:"+mid);
				found=true;
				break;
			}
			else if(arr[mid]<n) low=mid+1;
			else high=mid-1;
		}
		if(!found) {
			System.out.println(n+" not found");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Ente the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int target=sc.nextInt();
		
		linear(arr,target);
		binary(arr,target);
	}
}
