package assignment;

import java.util.Scanner;

public class Xylem_Phloem {
	public static boolean isXylem(int n) {
		int last=n%10;
		int first=n;
		int midsum=0;
		
		while(first>=10) first=first/10;
		n=n/10;
		while(n>9) {
			midsum+=n%10;
			n=n/10;
		}
		return (first+last)==midsum;
	}
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(isXylem(n))System.out.println("It is a xylem number");
		else System.out.println("It is a phloem number");
	}
}
