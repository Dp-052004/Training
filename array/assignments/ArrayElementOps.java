package array_assgn;

import java.util.Scanner;

public class ArrayElementOps {
	public static int[] addElementInIndex(int[] arr,int elem,int index) {
		if (index < 0 || index > arr.length) {
	        System.out.println("Invalid index");
	        return arr;
	    }

	    int[] newArr = new int[arr.length + 1];

	    for (int i = 0; i < newArr.length; i++) {
	        if (i < index) {
	            newArr[i] = arr[i];
	        } else if (i == index) {
	            newArr[i] = elem;
	        } else {
	            newArr[i] = arr[i - 1];
	        }
	    }
	    return newArr;
	}
	
	public static int[] replaceElementInIndex(int[] arr,int elem,int index) {
			 if (index < 0 || index >= arr.length) {
			        System.out.println("Invalid index");
			        return arr;
			    }

			    arr[index] = elem;
			    return arr;
	}
	public static int[] removeElementFromIndex(int[] arr,int elem,int index) {
		if (index < 0 || index >= arr.length) {
	        System.out.println("Invalid index");
	        return arr;
	    }

	    int[] newArr = new int[arr.length - 1];

	    for (int i = 0, j = 0; i < arr.length; i++) {
	        if (i != index) {
	            newArr[j++] = arr[i];
	        }
	    }
	    return newArr;
	}
	public static void printSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int a[]=addElementInIndex(arr,22,1);
		int b[]=replaceElementInIndex(arr,1,0);
		int c[]=removeElementFromIndex(arr,1,2);
		
		printSum(a);
		System.out.println();
		printSum(b);
		System.out.println();
		printSum(c);
	}
}
