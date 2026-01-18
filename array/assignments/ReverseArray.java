package array_assgn;

public class ReverseArray {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40};
	        int[] rev = new int[arr.length];

	        int j = 0;
	        for (int i = arr.length - 1; i >= 0; i--) {
	            rev[j++] = arr[i];
	        }

	        System.out.println("Reversed Array:");
	        for (int x : rev) {
	            System.out.print(x + " ");
	        }
	    }
}
