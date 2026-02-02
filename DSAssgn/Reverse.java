package DSAssgn;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
	public static String reverseUsingStack(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();  //creates string builder object
         while (!stack.isEmpty()) {
            reversed.append(stack.pop()); 
        }
        return reversed.toString();  //converts the string builder object to String
        //using toString() method
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println(reverseUsingStack(s));
    }
}
