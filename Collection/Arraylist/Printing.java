package Collection.Arraylist;

import java.util.ArrayList;

public class Printing {
	public static void main(String[] args) {
		ArrayList<Student> s1=new ArrayList<Student>();
		s1.add(new Student(10,"xyz"));
		s1.add(new Student(11,"abc"));
		s1.add(new Student(12,"cccc"));
		
		Student s=new Student(13,"uvwxyz");
		s1.add(s);
		System.out.println(s1);
	}
	
}
