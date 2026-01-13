package assignment;

public class AvgDigits {
	public static void main(String[] args) {
		int sum=0,n=1234,cnt=0;
		while(n>0) {
			int d=n%10;
			cnt++;
			sum+=d;
			n=n/10;
		}
		float avg=(float)sum/cnt;
		System.out.println(avg);
	}
}
