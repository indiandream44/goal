package com.naveen.math;

import java.util.ArrayList;
import java.util.List;

public class MathOperation {

	public List<Integer> primeNumberInRange(int start, int end) {
		List<Integer> primeList = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for (int number = start; number <= end; number++) {
			boolean flag = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
			  primeList.add(number);
			}
		}
		return primeList;
	}

}
