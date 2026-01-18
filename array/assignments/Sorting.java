package array_assgn;

import java.util.Scanner;

public class Sorting {
	public static void sort(int[] arr) {
		int n=arr.length,temp;
		boolean swap=false;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(swap==false) break;
		}
	}
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
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
		
		sort(arr);
		System.out.println("Sorted array:");
		print(arr);
	}
}
