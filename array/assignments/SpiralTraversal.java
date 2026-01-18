package array_assgn;

public class SpiralTraversal {

    public static int[] spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[] ans = new int[n * m];
        int idx = 0;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (left <= right && top <= bottom) {
            // Top row
            for (int i = left; i <= right; i++) {
                ans[idx++] = matrix[top][i];
            }
            top++;
            
            // Right column
            for (int i = top; i <= bottom; i++) {
                ans[idx++] = matrix[i][right];
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[idx++] = matrix[bottom][i];
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[idx++] = matrix[i][left];
                }
                left++;
            }
        }
        return ans;
    }
    
    //Upper triangular and Lower triangular
    public static void convertToUpperTriangular(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) matrix[i][j] = 0;
            }
        }
    }
    public static void convertToLowerTriangular(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) matrix[i][j] = 0;
            }
        }
    }
    
    //search in row-wise and col-wise sorted 2D array
    public static boolean searchInSortedMatrix(int[][] matrix, int n, int m, int target) {
        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    
    public static void print(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
    
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] res = spiralOrder(arr);  //spiral order of matrix

        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
        boolean found = searchInSortedMatrix(arr, 3, 3, 5);//row-wise and col-wise sorted array
        System.out.println(found);
        
        
        convertToUpperTriangular(arr, 3);  //upper triangular  
        print(arr);
        convertToLowerTriangular(arr, 3);  //lower triangular
        print(arr);
        
//        boolean found = searchInSortedMatrix(arr, 3, 3, 5);//row-wise and col-wise sorted array
//        System.out.println(found);
    }

}
