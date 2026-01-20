package Interface;

public class EmpServiceImpl implements EmpService{

	@Override
	public Emp[] getHighSalaryEmployees(Emp[] employees, double minSalary) {
		int count = 0;
		for (Emp e : employees) {
			if (e.sal > minSalary)
				count++;
		}

		Emp[] res = new Emp[count];
		int index = 0;

		for (Emp e : employees) {
			if (e.sal > minSalary)
				res[index++] = e;
		}
		return res;
	}

	@Override
	public double calculateAverageSalary(Emp[] employees) {
		double sum = 0;
		for (Emp e : employees) {
			sum += e.sal;
		}
		return sum / employees.length;
	}

	@Override
	public Emp getTopPaidEmployee(Emp[] employees) {
		Emp top = employees[0];

		for (Emp e : employees) {
			if (e.sal > top.sal)
				top = e;
		}
		return top;
	}

	@Override
	public Emp[] getExperiencedEmployees(Emp[] employees, int minYears) {
		int count = 0;
		for (Emp e : employees) {
			if (e.experience >= minYears)
				count++;
		}

		Emp[] res = new Emp[count];
		int index = 0;

		for (Emp e : employees) {
			if (e.experience >= minYears)
				res[index++] = e;
		}
		return res;
	}

	@Override
	public Emp getTopPaidEmployeeByDepartment(Emp[] employees, String department) {
		Emp top = null;

		for (Emp e : employees) {
			if (e.department.equalsIgnoreCase(department)) {
				if (top == null || e.sal > top.sal) {
					top = e;
				}
			}
		}
		return top;
	}

	@Override
	public double getAverageSalaryByDepartment(Emp[] employees, String department) {
		double sum = 0;
		int count = 0;

		for (Emp e : employees) {
			if (e.department.equalsIgnoreCase(department)) {
				sum += e.sal;
				count++;
			}
		}
		return count == 0 ? 0 : sum / count;
	}
	
}
