package com.naveen.math;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class MathOperationTest extends TestCase {

	private MathOperation mathOperation;
	
	@Before
	public void setup(){
		mathOperation = new MathOperation();
	}
	
	@Test
	public void testPrimeNumbersInARange(){
		mathOperation = new MathOperation();
		// Input data
		int start = 20;
		int end = 50;
		// Expected result
		List<Integer> primeList = new ArrayList<Integer>();
		primeList.add(23);
		primeList.add(29);
		primeList.add(31);
		primeList.add(37);
		primeList.add(41);
		primeList.add(43);
		
		
		
		// Test operation
		List<Integer> actualList = mathOperation.primeNumberInRange(start , end);
		//Verification
		Assert.assertNotNull(actualList);
		Assert.assertTrue(!actualList.isEmpty());
		Assert.assertEquals(primeList.get(0), actualList.get(0));
		Assert.assertEquals(primeList.get(1), actualList.get(1));
		Assert.assertEquals(primeList.get(2), actualList.get(2));
		Assert.assertEquals(primeList.get(3), actualList.get(3));
		Assert.assertEquals(primeList.get(4), actualList.get(4));
		Assert.assertEquals(primeList.get(5), actualList.get(5));
	}
}
