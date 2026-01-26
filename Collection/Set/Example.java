package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		Set<String> st1=new HashSet<>();
		
		//to add elements add() method as was in list
		st1.add("java");
		st1.add("c");
		st1.add("c++");
		
		//reading elements
		System.out.println(st1.contains("java")); //contains() method returns true or false
		
		//deleting elements
		st1.remove("c");
		System.out.println(st1);
	}
}
