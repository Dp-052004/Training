package Scenario_Questions;

public class D13_Question2 {
	public static void main(String[] args) {
		Employee e1=new Employee(12,"ABC","IT");
		try {
	        e1.setSalary(100000);
	    } catch (InvalidSalaryException e) {
	        System.out.println(e.getMessage());
	    } catch (UnauthorizedAccessException e) {
	        System.out.println(e.getMessage());
	    }
		
		PayrollBehaviour p1 = new FullTime();
	    PayrollBehaviour p2 = new Contract();

	    p1.payroll();
	    p2.payroll();
	}
	
}

class Employee{
	int EmployeeID;
	String name;
	String role;
	private double salary;
	
	Employee(){
		
	}
	Employee(int EmployeeID,String name,String role){
		this.EmployeeID=EmployeeID;
		this.name=name;
		this.role=role;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) throws InvalidSalaryException {
		if(salary<1000) {
			throw new InvalidSalaryException("Invalid salary");
		}
		if (!role.equalsIgnoreCase("HR")) {
            throw new UnauthorizedAccessException("Only HR can modify salary");
        }

        this.salary = salary;
	}
}

interface PayrollBehaviour{
	void payroll();
}

class FullTime implements PayrollBehaviour{
	
	@Override
	public void payroll() {
		System.out.println("Payroll for full time employee");
	}
	public void payroll(int exp) {
		System.out.println("Payroll for full time experienced employee");
	}
}

class Contract implements PayrollBehaviour{
	
	@Override
	public void payroll() {
		System.out.println("Payroll for contractual employee");
	}
	public void payroll(int exp) {
		System.out.println("Payroll for full time experienced employee");
	}
}

class InvalidSalaryException extends Exception{

	public InvalidSalaryException(String msg) {
		super(msg);
	}
}

class UnauthorizedAccessException extends RuntimeException {
    public UnauthorizedAccessException(String msg) {
        super(msg);
    }
}
