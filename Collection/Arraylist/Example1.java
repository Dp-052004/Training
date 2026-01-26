package Collection.Arraylist;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("java");
		a1.add(45.8);
		System.out.println("a1"+a1);
		
		ArrayList a2=new ArrayList(3); //initial capacity is 3
		//afterwards if more elements are added then resizing occurs
		a2.add(23);
		a2.add("dgi");
		a2.add(12.44);
		a2.add(true);
		ArrayList a3=new ArrayList(a1);  //initialized with [java,45.8] 
		System.out.println(a2);
		System.out.println(a3);
	}
}
