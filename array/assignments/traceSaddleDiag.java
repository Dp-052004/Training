package array_assgn;

import java.util.Scanner;

public class traceSaddleDiag {
	public static int trace(int[][] a) {
		int n=a.length;
		if(n!=a[0].length) {
			System.out.println("Trace not defined for non square matrix");
			return -1;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i][i];
		}
		return sum;
	}
	
	public static void saddle(int[][] a) {
		int rows=a.length;
		int cols=a[0].length;
		boolean flag=false;
		
		for(int i=0;i<rows;i++) {
			int mini=a[i][0];
			int index=0;
			
			for(int j=1;j<cols;j++) {
				if(a[i][j]<mini) {
					mini=a[i][j];
					index=j;
				}
			}
			
			boolean isSaddle=true;
			for(int k=0;k<rows;k++) {
				if(a[k][index]>mini) {
					isSaddle=false;
					break;
				}
			}
			if(isSaddle) {
				System.out.println("Saddle point="+mini+" at index ("+i+","+index+")");
				flag=true;
			}
		}
		if(!flag) System.out.println("No saddle point");
	}
	
	public static void Diag(int[][] a) {
		System.out.println("Diagonal elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i][i]);
		}	
		
		System.out.println("Secondary diagonal elements are:");
		int n=a.length;
		if (n != a[0].length) {
	        System.out.println("Secondary diagonal not defined for non-square matrix");
	        return;
	    }
		for (int i = 0; i < n; i++) {
	        System.out.print(a[i][n - 1 - i] + " ");
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of the array1");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter the dimensions of the array2");
		int n1=sc.nextInt();
		int m1=sc.nextInt();
		System.out.println("Enter elements");
		int a[][]=new int[n][m];
		int b[][]=new int[n1][m1];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Trace of matrix is:"+trace(a));
		saddle(a);
		Diag(b);
	}
}
