package assignment;

public class countZeros {
	public static void main(String[] args) {
		int n=70,cnt=0;
		while(n>0) {
			int d=n%10;
			if(d==0)
				cnt++;
			n=n/10;
		}
		System.out.println(cnt);
	}
}
