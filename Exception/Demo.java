package Exception;

public class Demo {
	public static void CheckedException() {
		System.out.println("hii");
		try {
			Thread.sleep(3000);  //internally may cause InterruptedException
		} catch(InterruptedException e) {
			System.out.println("Sleep method called");
		}
		System.out.println("bye");
	}
	
	public static void m1() throws Exception{
		System.out.println("hii");
		Class.forName("array1d.Student");
		System.out.println("bye");
	}
	
	public static void main(String[] args) throws Exception{
		//ARITHMETIC EXCEPTION
		//System.out.println(5/0);
		
		//STRING INDEX OUT OF BOUNDS EXCEPTION
//		String s="xyz";
//		System.out.println(s.charAt(10));
		
		//NULL POINTER EXCEPTION
//		String s=null;
//		System.out.println(s.toLowerCase());
		
		
		//TRY CATCH BLOCK USAGE FOR EXCEPTION HANDLING
//		System.out.println("hii");
//		try {
//			System.out.println(7/0);
//		}catch(ArithmeticException e) {
//			System.out.println("zero");
//		}
//		System.out.println("bye");
		
		//CheckedException();
//		System.out.println("hii");
//		try {
//			Thread.sleep(3000);  //internally may cause InterruptedException
//		} catch(InterruptedException e) {
//			System.out.println("Sleep method called");
//		}
//		System.out.println("bye");
		
		
//		System.out.println("hii");
//		try {
//			Class.forName("arrays.Duplica");
//		} catch(ClassNotFoundException e) {
//			System.out.println("Class not in the same package");
//		} 
//		System.out.println("bye");
		try {
		m1();
		}catch(Exception e) {
			System.out.println("handled");
		}
		
		
	}
}
