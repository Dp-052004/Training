package polymorphism;

public class Employee {
	int id;
	String name;
	int salary;
	String dep;
	
	Employee(int id){
		this.id=id;
	}
	Employee(int id,String name){
		this(id);
		this.name=name;
	}
	Employee(int id,String name,int salary){
		this(id,name);
		this.salary=salary;
	}
	Employee(int id,String name,int salary,String dep){
		this(id,name,salary);
		this.dep=dep;
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(11);
		Employee e2=new Employee(12,"Dinga");
		Employee e3=new Employee(14,"Dinga",400000);
		Employee e4=new Employee(33,"Dinga",400000,"IT");
		System.out.println(e1.id);
		System.out.println("-----------");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println("-----------");
		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.salary);
		System.out.println("-----------");
		System.out.println(e4.id);
		System.out.println(e4.name);
		System.out.println(e4.salary);
		System.out.println(e4.dep);

	}
}
