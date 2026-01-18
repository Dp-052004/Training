package array_assgn;

import java.util.Scanner;

public class Largest {
	public static void largest(int[] arr) {
		int maxi=arr[0];//mini=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxi) maxi=arr[i];
		}
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]<mini) mini=arr[i];
//		}
		System.out.println(maxi);
//		System.out.println(mini);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		largest(arr);
	}
}
