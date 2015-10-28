package learning;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;


public class EmployeeVectorTest {

	private EmployeeVector employeeVector = new EmployeeVector();
	
	@Test
	public void testAddEmployee() {
		// Test data
		Employee employee1 = new Employee("1", "Nitin");
		Employee employee2 = new Employee("2", "Naveen");
		Employee employee3 = new Employee("3", "Hitesh");
		// Test operation
		employeeVector.addEmployee(employee1);
		employeeVector.addEmployee(employee2);
		employeeVector.addEmployee(employee3);
		// Test verification
		employeeVector.display();
		Assert.assertTrue(true);
	}

}
