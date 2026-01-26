package Collection.Arraylist;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return "id: "+id+" name: "+name+" dept: "+dept+" salary: "+salary;
	}
}
