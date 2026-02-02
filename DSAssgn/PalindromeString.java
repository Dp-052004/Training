package DSAssgn;

import java.util.Scanner;

public class PalindromeString {
	
	public static boolean palin(String s,int left,int right) {
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean isPalindrome(String s) {
		int left=0,right=s.length()-1;
		while(left<=right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return palin(s,left+1,right) || palin(s,left,right-1);
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		
		if(isPalindrome(s)) System.out.println("Palindrome string");
		else System.out.println("NOt palindrome string");
	}
}
