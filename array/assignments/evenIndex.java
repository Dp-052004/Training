package array_assgn;

import java.util.Scanner;

public class evenIndex {
	public static void evenPrint(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]+" ");
			}
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
		
		evenPrint(arr);
	}
}
