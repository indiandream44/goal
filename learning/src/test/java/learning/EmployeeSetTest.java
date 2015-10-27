package learning;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

// Ctrl+shift+o -> Organizing import
public class EmployeeSetTest {

	private EmployeeSet employeeSet = new EmployeeSet();
	
	@Test
	public void testAddEmployee() {
		// Test data
		Employee employee = new Employee("128793", "Nitin Upadhyay");
		// Test operation
		employeeSet.addEmployee(employee);
		// Test verification
		Set<Employee> employees = employeeSet.getEmployees();
		for(Employee item : employees) {
			if("128793".equals(item.getEmpid())){
				Assert.assertTrue(true);
				return;
			}
		}
		Assert.fail("We did not find our employee.");
	}

	@Test
	public void testGetEmployees() {
		Assert.fail("Not implemented yet.");
		// Test data
		
		// Test operation
		
		// Test verification
		
	}

}
