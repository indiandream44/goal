package com.naveen.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import learning.Employee;

public class GenericsDemo {

	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
		 list.add("String");
		 list.add("String2");
		 
		 Set<Integer> setInteger = new HashSet<Integer>();
		 
		 setInteger.add(34);
		 setInteger.add(55);
		 
		 Iterator<String> iterator = list.iterator();
		 while(iterator.hasNext()){
			 String str = (String) iterator.next();
			 System.out.println(str);
			 System.out.println();
		 }
		 
		 Iterator<Integer> setIterator = setInteger.iterator();
		 while(setIterator.hasNext()){
			 System.out.println(setIterator.next());
			 System.out.println();
		 }
		 
		 iterateElement(list, String.class);
		 iterateElement(setInteger, Integer.class);
		 
		 Employee employee = new Employee("Test", "emp name");
		 // Type safety
		 Type<Employee> typeEmployee = new Type<>();
		 typeEmployee.setItem(employee);
		 Employee employee2 = typeEmployee.getItem();
		 System.out.println(employee2);
	}
	
	// Generic method
	public  static <T> void iterateElement(Collection collection, T t) {
		Iterator<T> iterator = collection.iterator();
		 while(iterator.hasNext()){
			 System.out.println(iterator.next());
			 System.out.println();
		 }
		 
		 
	}
	
	// Generic class
    static class Type <T> {
    	private T t;
    	public void setItem(T t){
    		this.t = t;
    	}
    	
    	public T getItem(){
    		return t;
    	}
    }
}
