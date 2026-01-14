package oops;

public class Employee {
	private int id;
	private double salary;
	private int pass;
	
	public int getId() {
		return id;
	}
	public double getSalary(int pass) {
		if(this.pass==pass) {
			return salary;
		}
		System.out.println("Incorrect password");
		return -1;
	}
	public int getPass() {
		return pass;
	}
	
	
	//SETTERS
	public void setId(int id) {
		this.id=id;
	}
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}else {
			System.out.println("Invalid");
		}
	}
	public void setPass(int pass) {
		this.pass=pass;
	}
	
	
	public static void main(String[] args) {
		System.out.println("\nEMPLOYEE DETAILS");
        Employee e = new Employee();
        e.setId(501);
        e.setPass(9999);
        e.setSalary(45000);

        System.out.println("Employee ID: " + e.getId());
        System.out.println("Salary (correct password): " + e.getSalary(9999));
        System.out.println("Salary (wrong password): " + e.getSalary(1111));
	}
}
