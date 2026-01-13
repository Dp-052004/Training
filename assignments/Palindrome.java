package assignment;

public class Palindrome {
	public static void main(String[] args) {
		int n=1211,rev=0,num=n;
		while(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==num)System.out.println("Palindrome number");
		else System.out.println("Not Palindrome number");
	}
}
