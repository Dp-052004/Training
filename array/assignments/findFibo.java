package array_assgn;

import java.util.Scanner;

public class findFibo {
	static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) return true;
            int c = a + b;
            a = b;
            b = c;
        }
        return false;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:arr) {
			if(isFibonacci(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
