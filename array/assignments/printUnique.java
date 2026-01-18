package array_assgn;

import java.util.Scanner;

public class printUnique {
	public static void unique(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int cnt=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
				}
			}
			if(cnt==1)System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		unique(arr);
	}
}
