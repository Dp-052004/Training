package array_assgn;

public class FirstLast {
	    public static void main(String[] args) {

	        char[] arr = {'J', 'A', 'V', 'A'};

	        if (arr.length > 0) {
	            System.out.println("First Character: " + arr[0]);
	            System.out.println("Last Character: " + arr[arr.length - 1]);
	        } else {
	            System.out.println("Array is empty");
	        }
	    }
}
