package array_assgn;

import java.util.Scanner;

public class MatOps {
	public static void addMat(int[][] a,int[][] b) {
		int n1=a.length;
		int m1=a[0].length;
		int n2=b.length;
		int m2=b[0].length;
		 int sum[][]=new int[n1][m1];
		 
		if(n1!=n2 && m1!=m2) {
			System.out.println("Addition not possible");
			return;
		}
		
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m1;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of matrices:");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<m1;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void boundary(int[][] a) {
		System.out.println("The boundary elements are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i==0 || j==0 || i==a.length-1 || j==a[0].length-1) {
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}
	
	public static boolean areMatEqual(int[][] a, int[][] b) {
	    if (a.length != b.length) return false;
	    
	    if (a[0].length != b[0].length) return false;

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            if (a[i][j] != b[i][j]) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of the array");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter elements");
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
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
		
		addMat(a,b);
		boundary(a);
		System.out.println();
		if(areMatEqual(a,b)) {
			System.out.println("Matrices are equal");
		}else {
			System.out.println("Matrices are not equal");
		}
	}
}

// 2 3 4
// 5 6 7
// 8 9 1
