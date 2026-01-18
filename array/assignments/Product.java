package array_assgn;

import java.util.Scanner;

public class Product {
	public static void printProd(int[] arr) {
		int prod=1;
		for(int i=0;i<arr.length;i++) {
			prod*=arr[i];
		}
		System.out.println(prod);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		printProd(a);
	}
}
