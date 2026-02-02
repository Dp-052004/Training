package DSAssgn;

import java.util.Scanner;

public class InsertDelete {
	public static int[] addAtPos(int[] arr,int element,int pos) {
		int n = arr.length;
	    int[] newArr = new int[n + 1];

	    for (int i = 0; i < pos; i++) {
	        newArr[i] = arr[i];
	    }

	    newArr[pos] = element;

	    for (int i = pos; i < n; i++) {
	        newArr[i + 1] = arr[i];
	    }

	    return newArr;
	}
	
	public static int[] deleteAtPos(int[] arr, int pos) {
	    int n = arr.length;

	    if (pos < 0 || pos >= n) {
	        System.out.println("Invalid position");
	        return arr;
	    }

	    int[] newArr = new int[n - 1];

	    for (int i = 0; i < pos; i++) {
	        newArr[i] = arr[i];
	    }

	    for (int i = pos + 1; i < n; i++) {
	        newArr[i - 1] = arr[i];
	    }

	    return newArr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position to insert");
		int pos=sc.nextInt();
		System.out.println("Enter the element to insert");
		int elem=sc.nextInt();
		System.out.println("Enter the position to delete");
		int pos1=sc.nextInt();
		
//		int[] res=addAtPos(a,elem,pos);
//		for(int i:res) {
//			System.out.print(i+" ");
//		}
		
		int[] res=deleteAtPos(a,pos);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
}
