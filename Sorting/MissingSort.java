package Sorting;

import java.util.HashMap;

public class MissingSort {
	public static void countSort(int[] arr) {
//		HashMap<Integer,Integer> map=new HashMap<>();
//		for(int i:arr) {
//			map.put(i,map.getOrDefault(i,0)+1);
//		}
		int n=arr.length;
		int[] hash=new int[n+1];
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<hash[i];j++) {
				arr[i]=hash[j];
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
