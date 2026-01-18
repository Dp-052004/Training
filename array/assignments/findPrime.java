package array_assgn;

import java.util.Scanner;

public class findPrime {
	public static boolean prime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Ente the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int x:arr) {
			if(prime(x)) {
				System.out.print(x+" ");
			}
		}
	}
}
