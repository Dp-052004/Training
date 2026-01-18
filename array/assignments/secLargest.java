package array_assgn;

import java.util.Scanner;

public class secLargest {
	public static int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int largest=arr[0];
        int slargest=-1;
        
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            
            if(arr[i]!=largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Ente the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The 2nd largest element is:"+getSecondLargest(arr));
	}
}
