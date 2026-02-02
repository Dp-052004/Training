package DSAssgn;

import java.util.Scanner;

public class ArrayImpl {
	public static void main(String[] args) {
		int[] a=new int[5];
		int[][] arr=new int[2][3];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("1D array elements:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		System.out.println("2D array elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
