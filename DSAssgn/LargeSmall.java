package DSAssgn;
import java.util.Scanner;

public class LargeSmall {
	public static int[] largeSmall(int []arr) {
		int maxi=arr[0],mini=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<mini) mini=arr[i];
		}
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxi) maxi=arr[i];
		}
		
		return new int[] {maxi,mini};
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of the array");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int []res=largeSmall(a);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
}





