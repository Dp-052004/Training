package Exception;

public class Example {
	public static void Arithmetic(int n) {
		try {
			System.out.println(n/0);
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero not allowed");
		}
	}
	
	public static void ArrayBounds(int[] arr) {
		int n=arr.length;
		try {
			System.out.println(arr[n+1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds");
		}
	}
	
	public static void StringBounds() {
		try {
			String s="xyz";
			System.out.println(s.charAt(4));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Sting index is out of bounds");
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[2];
		Arithmetic(5);
		ArrayBounds(arr);
		StringBounds();
	}
}
