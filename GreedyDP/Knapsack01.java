package GreedyDP;

import java.util.Arrays;

public class Knapsack01 {
	public static int knapsack(int W,int[] val,int[] wt) {
		int n=val.length;
		int[][] dp=new int[n][W+1];
		for (int i = 0; i < n; i++) {
		    Arrays.fill(dp[i], -1);
		}
		return f(n-1,W,val,wt,dp);
	}
	
	public static int f(int ind,int W,int[] val,int[] wt,int[][] dp) {
		if(ind==0) {
			if(wt[0]<=W) return val[0];
			else return 0;
		}
		if(dp[ind][W]!=-1) return dp[ind][W];
		
		int notTake=0+f(ind-1,W,val,wt,dp);
		int take=Integer.MIN_VALUE;
		
		if(wt[ind]<=W) {
			take=val[ind]+f(ind-1,W-wt[ind],val,wt,dp);
		}
		return dp[ind][W]=Math.max(notTake, take);
	}
	
	public static void main(String[] args) {

        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int W = 50;   // capacity of knapsack

        int maxProfit = knapsack(W, val, wt);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
