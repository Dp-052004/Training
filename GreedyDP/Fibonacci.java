package GreedyDP;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	public static int fibo(int n) {
		int[] dp=new int[n+1];
		Arrays.fill(dp, -1);
		return fib(n,dp);
	}
	
	public static int fib(int n,int[] dp) {
		if(n==0 || n==1) return n;
		if(dp[n]!=-1) return dp[n];
		return dp[n]=fib(n-1,dp)+fib(n-2,dp);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		int n=sc.nextInt();
		System.out.println("The fibonacci no at index "+n+" is:"+fibo(n));
	}
}
