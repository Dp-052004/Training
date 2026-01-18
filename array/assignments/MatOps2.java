package array_assgn;

import java.util.Scanner;

public class MatOps2 {
	public static void multiplyMatrices(int[][] A, int[][] B) {
	    int r1 = A.length;
	    int c1 = A[0].length;
	    int r2 = B.length;
	    int c2 = B[0].length;

	    if (c1 != r2) {
	        System.out.println("Matrix multiplication not possible");
	        return;
	    }

	    int[][] result = new int[r1][c2];

	    for (int i = 0; i < r1; i++) {
	        for (int j = 0; j < c2; j++) {
	            for (int k = 0; k < c1; k++) {
	                result[i][j] += A[i][k] * B[k][j];
	            }
	        }
	    }

	    System.out.println("Product Matrix:");
	    for (int i = 0; i < r1; i++) {
	        for (int j = 0; j < c2; j++) {
	            System.out.print(result[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	public static void transposeMatrix(int[][] matrix) {
	    int r = matrix.length;
	    int c = matrix[0].length;

	    int[][] transpose = new int[c][r];

	    for (int i = 0; i < r; i++) {
	        for (int j = 0; j < c; j++) {
	            transpose[j][i] = matrix[i][j];
	        }
	    }

	    System.out.println("Transpose Matrix:");
	    for (int i = 0; i < c; i++) {
	        for (int j = 0; j < r; j++) {
	            System.out.print(transpose[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	public static void rotate90(int[][] matrix, int n) {

	    // Transpose
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }

	    // Reverse each row
	    for (int i = 0; i < n; i++) {
	        int left = 0, right = n - 1;
	        while (left < right) {
	            int temp = matrix[i][left];
	            matrix[i][left] = matrix[i][right];
	            matrix[i][right] = temp;
	            left++;
	            right--;
	        }
	    }
	}
	public static int countZeros(int[][] matrix, int r, int c) {
	    int count = 0;

	    for (int i = 0; i < r; i++) {
	        for (int j = 0; j < c; j++) {
	            if (matrix[i][j] == 0) {
	                count++;
	            }
	        }
	    }
	    return count;
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- MATRIX INPUT ----------
        System.out.println("Enter rows and columns of matrix A:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns of matrix B:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // ---------- MULTIPLICATION ----------
        multiplyMatrices(A, B);

        // ---------- TRANSPOSE ----------
        transposeMatrix(A);

        // ---------- ROTATE 90 DEG CLOCKWISE ----------
        if (r1 == c1) {
            rotate90(A, r1);
            System.out.println("Matrix A after 90 degree clockwise rotation:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Rotation requires square matrix");
        }

        // ---------- COUNT ZEROS ----------
        int zeroCount = countZeros(A, r1, c1);
        System.out.println("Number of zero elements in matrix A: " + zeroCount);

        sc.close();
    }
}
