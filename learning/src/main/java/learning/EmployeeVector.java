package learning;

import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

	private Vector<Employee> employees = new Vector<>();
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public void display(){
		Iterator<Employee> iterator = employees.iterator();
		while(iterator.hasNext()){
			Employee employee = iterator.next();
			System.out.println(employee);
		}
	}
}
