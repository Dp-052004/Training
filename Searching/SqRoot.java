package Searching;

public class SqRoot {
	public static int findRoot(int n) {
		int low=1,high=n,ans=0;
		while(low<=high) {
			long mid=low+(high-low)/2;
			ans=(int)(mid*mid);
			if(ans<=n) {
				ans=(int)mid;
				low=(int)mid+1;
			}
			else high=(int)mid-1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int n=25;
		System.out.println(findRoot(n));
		System.out.println(findRoot(36));
		System.out.println(findRoot(4));
	}
}
