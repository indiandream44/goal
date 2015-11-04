package learning.filehandling;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		// Test data
		int a = 10;
		int b =  20;
		int expected = 30;
		// Test operation
		int actual = calculator.add(a, b);
		// Test verification
		Assert.assertEquals(expected, actual);
		
		
		
	}
	
	@Test
	public void testMultiplication() {
		Calculator a =new Calculator();
		//test data
		int c=3;
		int d=4;
		int expecteds=12;
		//test operation
		int actual = a.multiplication(c,d);
		//test verification
		Assert.assertEquals(expecteds, actual);
	}

}
