package com.taetae.collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import com.taetae.collection.list.Empolyee; 

public class VectorExample { 
	
	public static void main(String[] args) {
		 
		
		List<Employee> employeeList = new Vector<>();
		List<Employee> employeeList1 = Arrays.asList(
				
				new Employee(1,"abc"),
				new Employee(1,"xyz"),
				new Employee(1,"pqr"));
		
	}
   
}
