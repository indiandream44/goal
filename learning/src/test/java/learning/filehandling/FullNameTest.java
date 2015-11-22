package learning.filehandling;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class FullNameTest {

	@Test
	public void test() 
		String firstName = "Nitin";
		String lastName = "Upadhyay";
		String expectedResult = "Nitin Upadhyay";
		FullName f =new FullName();
		
		//Test operation
		String fullName = f.getFullName(firstName, lastName);
		
		// Test verification
		Assert.assertEquals(expectedResult, fullName);
	}

	// TODO: Create a class having functionality to give all odd numbers for a given range 
}
