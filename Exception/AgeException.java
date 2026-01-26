package Exception;

public class AgeException extends RuntimeException{
	
	public AgeException(String msg) {
		super(msg);
	}
	
	public static void checkAge(int age) {
		if(age>0) {
			System.out.println("Age is valid");
		}else {
			throw new AgeException(age+ " is invalid");
		}
	}
	
	public static void main(String[] args) {
		int age1=10;
		checkAge(age1);
		int age2=-10;
		checkAge(age2);
	}
}
