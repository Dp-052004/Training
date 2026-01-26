package Collection.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> l1=new LinkedList<>();
		
		l1.add("java");
		l1.add("sql");
		l1.add("c++");
		
		System.out.println(l1.get(0)); //gets the first element in the linked list
		
		//updating
		l1.set(1, "Javascript");
		System.out.println(l1);
		
		//deleting
		l1.remove("c++");
		System.out.println(l1);
	}
}
