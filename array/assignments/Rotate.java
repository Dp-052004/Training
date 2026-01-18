package array_assgn;

import java.util.Scanner;

public class Rotate {
	public static void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
    }

    public static void rightRotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    
    public static void leftRotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
    
    public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the k");
		int k=sc.nextInt();
		
		int[] arr1 = arr.clone();
		int[] arr2 = arr.clone();
		System.out.println("Array after LEFT rotation:");
	    leftRotate(arr1, k);
	    print(arr1);
	    System.out.println();
	    System.out.println("Array after RIGHT rotation:");
	    rightRotate(arr2, k);
	    print(arr2);
	}
}
