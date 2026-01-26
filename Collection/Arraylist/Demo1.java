package Collection.Arraylist;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("D");
		a2.add("E");
		
		a1.addAll(a2); //addAll() method adds all the elements of one list 
		//into another list
		System.out.println(a1);
		a1.addAll(2,a2); // with index and the list, the list elements get added 
		//from the specified index
		System.out.println(a1);
	}
}
