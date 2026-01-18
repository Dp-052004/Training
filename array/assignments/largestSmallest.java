package array_assgn;

import java.util.Scanner;

public class largestSmallest {
	public static int[] largeSmall(int [][]arr) {
		int maxi=arr[0][0],mini=arr[0][0];
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]<mini) mini=arr[i][j];
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>maxi) maxi=arr[i][j];
			}
		}
		
		return new int[] {maxi,mini};
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of the array");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter elements");
		int a[][]=new int[n][m];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		int []res=largeSmall(a);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
}
