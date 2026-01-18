package array_assgn;

import java.util.Scanner;

public class removeDuplicates {
	public static int[] remove(int[] arr) {
		int[] temp=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<k;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			
			if(!flag) {
				temp[k]=arr[i];
				k++;
			}
		}
		return temp;
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
		int res[]=remove(arr);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
}
