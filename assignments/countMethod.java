package assignment;

import java.util.Scanner;

public class countMethod {
	public static boolean isEqual(int n) {
		int cnt=0,even=0,odd=0;
		while(n>0) {
			int d=n%10;
			if(d%2==0) even++;
			else odd++;
			n=n/10;
		}
		if(even==odd) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(isEqual(n)) {
			System.out.println("No of even and odd digits are same");
		}
		else {
			System.out.println("No of even and odd digits are not same");
		}
	}
}
