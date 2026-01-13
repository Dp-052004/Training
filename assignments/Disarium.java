package assignment;

import java.util.Scanner;

public class Disarium {
	public static int power(int a,int x) {
		int res=1;
		while(x>0) {
			res=res*a;
			x--;
		}
		return res;
	}
	
	public static int count(int num) {
		int cnt=0;
		while(num>0) {
			cnt++;
			num=num/10;
		}
		return cnt;
	}
	
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=n,cnt=count(n),sum=0;
		while(n>0) {
			int d=n%10;
			sum+=power(d,cnt);
			cnt--;
			n=n/10;
		}
		if(sum==num) System.out.println("Disarium number");
		else System.out.println("Not Disarium number");
	}
}
