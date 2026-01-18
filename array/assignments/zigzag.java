package array_assgn;

import java.util.Scanner;

public class zigzag {
	public static void print(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static int[] Zigzag(int a[],int b[]) {
		int i=0,j=0,k=0;
		int n=a.length+b.length;
		int res[]=new int[n];
		
		while(i<a.length && j<b.length) {
			res[k++]=a[i++];
			res[k++]=b[j++];
		}
		while(i<a.length) {
			res[k++]=a[i++];
		}
		while(j<b.length) {
			res[k++]=b[j++];
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lengths of the 2 arrays:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] a=new int[n1];
		int[] b=new int[n2];
		System.out.println("Enter the elements of the 1st array:");
		for(int i=0;i<n1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of the 2nd array:");
		for(int i=0;i<n2;i++) {
			b[i]=sc.nextInt();
		}
		int[] arr=Zigzag(a,b);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
