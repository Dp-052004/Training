package Interface;

public class EmpDriver {
	public static void main(String[] args) {

		Emp[] employees = {
			new Emp(1, "Amit", 30000, "IT", 2),
			new Emp(2, "Rahul", 50000, "HR", 5),
			new Emp(3, "Sneha", 70000, "IT", 6),
			new Emp(4, "Pooja", 40000, "Finance", 3),
			new Emp(5, "Ravi", 60000, "IT", 4)
		};

		EmpService service = new EmpServiceImpl();

		System.out.println("High Salary Employees (>45000):");
		Emp[] highSal = service.getHighSalaryEmployees(employees, 45000);
		for (Emp e : highSal) {
			System.out.println(e.name + " " + e.sal);
		}

		System.out.println("\nAverage Salary:");
		System.out.println(service.calculateAverageSalary(employees));

		Emp top = service.getTopPaidEmployee(employees);
		System.out.println("\nTop Paid Employee:");
		System.out.println(top.name + " " + top.sal);

		System.out.println("\nExperienced Employees (>=4 years):");
		Emp[] exp = service.getExperiencedEmployees(employees, 4);
		for (Emp e : exp) {
			System.out.println(e.name + " " + e.experience);
		}

		Emp topIT = service.getTopPaidEmployeeByDepartment(employees, "IT");
		System.out.println("\nTop Paid in IT:");
		System.out.println(topIT.name + " " + topIT.sal);

		System.out.println("\nAverage Salary in IT:");
		System.out.println(service.getAverageSalaryByDepartment(employees, "IT"));
	}
}
