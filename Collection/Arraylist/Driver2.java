package Collection.Arraylist;

import java.util.ArrayList;

public class Driver2 {
	public static void main(String[] args) {
		ArrayList<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(10,"abc","IT",200000));
		e.add(new Employee(11,"bvc","IT",405000));
		e.add(new Employee(12,"dvx","HR",650000));
		e.add(new Employee(13,"zdv","HR",425000));
		
		System.out.println(findEmpByDep(e,"IT"));
		System.out.println(findEmpBySal(e,500000));
	}
		
	
	public static ArrayList<Employee> findEmpBySal(ArrayList<Employee>e,double salary) {
		ArrayList<Employee> ans=new ArrayList<Employee>();
		for(Employee e1:e) {
			if(e1.salary>salary) {
				ans.add(e1);
			}
		}
		return ans;
	}
	
	public static ArrayList<Employee> findEmpByDep(ArrayList<Employee>e,String dept) {
		ArrayList<Employee> ans=new ArrayList<Employee>();
		for(Employee e1:e) {
			if(e1.dept==dept) {
				ans.add(e1);
			}
		}
		return ans;
	}
}
