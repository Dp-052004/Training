package assignment;

public class countEvenOddDigits {
	public static void main(String[] args) {
		int n=2275,cnt=0,even=0,odd=0;
		while(n>0) {
			int d=n%10;
			if(d%2==0) even++;
			else odd++;
			n=n/10;
		}
		System.out.println("Even digits="+even);
		System.out.println("Odd digits="+odd);
	}
}
