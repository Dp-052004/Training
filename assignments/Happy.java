package assignment;

import java.util.Scanner;

public class Happy {
	public static boolean isHappyNumber(int num) {
	    while (num != 1 && num != 4) {
	        int sum = 0;

	        while (num > 0) {
	            int d = num % 10;
	            sum += d * d;
	            num /= 10;
	        }

	        num = sum;
	    }
	    return num == 1;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		if(isHappyNumber(n)) System.out.println("It is a happy number.");
		else System.out.println("Not a happy number.");
		}
	}