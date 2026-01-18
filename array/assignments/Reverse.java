package array_assgn;

import java.util.Scanner;

public class Reverse {
	public static int[] revArray(int[] arr) {
		int n=arr.length;
		int i=0,j=n-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int res[]=revArray(a);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		}
}
