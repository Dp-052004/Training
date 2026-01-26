package Exception;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("hi");
		try {
			System.out.println(7/0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("bye");
	}
}
