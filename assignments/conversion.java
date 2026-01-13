package assignment;

import java.util.Scanner;

public class conversion {
	public static int decimalToBinary(int n) {
		int bin=0;
		int pos=1;
		
		while(n>0) {
			int rem=n%2;
			bin+=rem*pos;
			pos=pos*10;
			n=n/2;
		}
		return bin;
	}
	
	public static int binaryToDecimal(int n) {
		int dec=0;
		int pow=1;
		
		while(n>0) {
			int rem=n%10;
			dec+=rem*pow;
			pow=pow*2;
			n=n/10;
		}
		return dec;
	}
	
	public static int decimalToOctal(int num) {
	    int octal = 0;
	    int pos = 1;

	    while (num > 0) {
	        int rem = num % 8;
	        octal += rem * pos;
	        pos *= 10;
	        num /= 8;
	    }

	    return octal;
	}
	
	public static String decimalToHexadecimal(int num) {
	    String hex = "";

	    while (num > 0) {
	        int rem = num % 16;
	        if (rem < 10)
	            hex = rem + hex;
	        else
	            hex = (char)(rem - 10 + 'A') + hex;

	        num /= 16;
	    }

	    return hex;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Decimal to Binary: " + decimalToBinary(n));
	    System.out.println("Binary to Decimal: " + binaryToDecimal(1010));
	    System.out.println("Decimal to Octal: " + decimalToOctal(n));
	    System.out.println("Decimal to Hexa: " + decimalToHexadecimal(n));
	}
}
