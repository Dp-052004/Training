package assignment;

public class countDigits {
	public static void main(String[] args) {
		int cnt=0,n=4563;
		while(n>0) {
			int d=n%10;
			cnt++;
			n=n/10;
		}
		System.out.println(cnt);
	}
}
