package Exception;

public class Driver {
	public static void main(String[] args) {
		//m1();  //--> StackOverflowError
		
		
		//OutOfMemoryError
		String s="xyz";
		while(true) {
			s=s+s;
		}
	}
	
	public static void m1() {
		System.out.println("hi");
		m1();
	}
}
