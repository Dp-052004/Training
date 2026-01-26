package Exception;

public class Driver1 {
	public static void main(String[] args) {
		
		
		Integer i=Integer.valueOf("123");
		System.out.println(i+1);
		
		Boolean b=Boolean.valueOf("true");
		System.out.println(b);
		
		
		int a=Integer.parseInt("123");  //Converts String datatype to int
		int c=Integer.parseInt("123a"); //Gives NumberFormatException because in numbers
		//character is coming
	}
}
