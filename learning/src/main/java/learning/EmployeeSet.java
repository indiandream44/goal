package learning;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet {

	private Set<Employee> employees = new HashSet<Employee>();
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public Set<Employee> getEmployees(){
		return employees;
	}
}
