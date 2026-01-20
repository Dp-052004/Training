package Interface;

public interface EmpService {
	Emp[] getHighSalaryEmployees(Emp[] employees, double minSalary);
	double calculateAverageSalary(Emp[] employees);
	Emp getTopPaidEmployee(Emp[] employees);
	Emp[] getExperiencedEmployees(Emp[] employees, int minYears);
	Emp getTopPaidEmployeeByDepartment(Emp[] employees, String department);
	double getAverageSalaryByDepartment(Emp[] employees, String department);
}
