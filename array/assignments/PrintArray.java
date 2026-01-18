package array_assgn;

import java.util.Scanner;

public class PrintArray {
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the no of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+i+"th element");
			arr[i]=sc.nextInt();
		}
		
		print(arr);
	}
}
