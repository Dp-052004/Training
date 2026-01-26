package Exception;

/* finally block written with try catch block
 * Clean up code written in the finally block
 * finally block always runs no matter what
 */
public class Demo1 {
	public static void main(String[] args) {
		try {
			System.out.println(7/0);
		}catch(NullPointerException e) {
			System.out.println("handled");
		}finally {
			 //CLEAN UP CODE WRITTEN HERE
			System.out.println("finally block");
			String s=null;
			System.out.println(s.toLowerCase());//in finally block null pointer  
		//exception is occurring because in finally block after that there is 
		//no catch block so the exception is thrown and then stops the code abruptly
			System.out.println("stop");
		}
	}
}
