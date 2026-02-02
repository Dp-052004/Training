package DSAssgn;

public class RemoveDuplicate {
	public static int[] remove(int[] arr) {
		int n = arr.length;
		if (n == 0) return arr;
		
		int[] temp = new int[n];
	    int j = 0;
	    temp[j++] = arr[0];
	    
	    
	    for (int i = 1; i < n; i++) {
	        if (arr[i] != arr[i - 1]) {
	            temp[j++] = arr[i];
	        }
	    }
	    
	    int[] result = new int[j];
	    for (int i = 0; i < j; i++) {
	        result[i] = temp[i];
	    }

	    return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
		int[] res = remove(arr);

		for (int x : res) {
		    System.out.print(x + " ");
		}
	}
}
