
package learning;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

	// Diomond operator which is introuduced in 1.7
	private Map<String, Employee> employees = new HashMap<>();
	
	// TODO: Add unit test case of this method
	public void addEmployee(String id, Employee employee){
		employees.put(id, employee);
	}

	// TODO: Add unit test case of this method
	public Map<String, Employee> getEmployees(){
		return employees;
	}
	
	// TODO : Display method : No test case
	
}
