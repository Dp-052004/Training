package assignment;

import java.util.Scanner;

public class palinMethod {
	public static boolean isPalindrome(int n) {
		int rev=0,num=n;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==num) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(isPalindrome(n)) System.out.println("Good");
		else System.out.println("Bad");
	}
}
