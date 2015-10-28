package learning;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet {

	private Set<Employee> employees = new HashSet<>();
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	// TODO : Test case for getEmployees method
	public Set<Employee> getEmployees(){
		return employees;
	}
	
	// TODO : Add a method that can tell that particular employee id available or not in the employee set
}
