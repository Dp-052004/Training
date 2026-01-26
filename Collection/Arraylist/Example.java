package Collection.Arraylist;

import java.util.ArrayList;

public class Example {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();  //it will take values of all datatypes
		a1.add("java");
		a1.add(45.8);
		a1.add(true);
		a1.add(20);
		a1.add("sql");
		int a=99;
		a1.add(a);
		a1.add("java");
		a1.add(45.8);
		a1.add(true);
		a1.add(20);
		a1.add("sql");
		System.out.println(a1);
		System.out.println(a1.size());
	}
}
