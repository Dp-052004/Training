package DSAssgn;

import java.util.Arrays;
import java.util.Stack;

//Array:
//[4,5,2,25]
//
//Stack:		
//25 
//25 2
//25 5
//
//Iterations in nge array
//[ , , ,-1]
//[ , ,25,-1]
//[5 ,25,25,-1]
//[]
public class NextGreaterElement {
	public static int[] nextGreater(int[] arr) {
		int n=arr.length;
		int[] nge=new int[n];
		Stack<Integer> stack=new Stack<>();
		for(int i=n-1;i>=0;i--) {
			
			while(!stack.isEmpty() && stack.peek()<=arr[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				nge[i]=-1;
			}else {
				nge[i]=stack.peek();
			}
			
			stack.push(arr[i]);
		}
		return nge;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 2, 25};
        int[] result = nextGreater(arr);
        
        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(result));
	}
}
