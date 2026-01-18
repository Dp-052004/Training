package array_assgn;

import java.util.Scanner;

public class copyArr {
	public static void copy(int[] arr) {
		int[] copy=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        System.out.println("Copied Array:");
        for (int x : copy) {
            System.out.print(x + " ");
        }
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
		copy(a);
	}
}
