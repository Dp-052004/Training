package Collection.Arraylist;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		//generic --> same type ele <Datatype>
		//non-generic --> diff type ele
		
		ArrayList<String> a1=new ArrayList<>();
		
		//to insert elements into arraylist add() method to be used
		a1.add("xyz");
		a1.add("abc");
		a1.add("java");
		a1.add("sql");
		a1.add("python");
		
		System.out.println(a1);
		
		//get() method takes the index and can be used to access the specific data at
		//a particular index
		System.out.println(a1.get(0));
		System.out.println(a1.get(1));
		
		
		//to update the arraylist there is set() method
		//it takes index and new element and updates the arraylist
		a1.set(0,"JS");
		System.out.println("The first element is:"+a1.get(0));
		
		
		//to delete element from arraylist there is remove() method
		a1.remove("python");
		System.out.println("Updated list:"+a1);

	}
}
