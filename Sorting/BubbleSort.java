package Sorting;

public class BubbleSort {
	public static void bubble(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean flag=false;  //flag to stop iteration unnecesarily
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) break;  //extra line to reduce time complexity a little
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {4,8,3,7,5};
		bubble(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
