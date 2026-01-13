package assignment;

import java.util.Scanner;

public class Leap {
	public static boolean isleap(int year) {
		boolean leap=false;
		if(year%4==0) {
			leap=true;
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}
				else {
					leap=false;
				}
			}
		}
		else leap=false;
		return leap;
	}
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		year=sc.nextInt();
		if(isleap(year)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not leap year");
		}
	}
}
