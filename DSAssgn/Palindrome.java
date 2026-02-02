package DSAssgn;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		Stack<Character> stack=new Stack<>();
		
		for(char c:s.toCharArray()) {
			stack.push(c);
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=stack.pop()) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String s=sc.next();
		if(isPalindrome(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
}
