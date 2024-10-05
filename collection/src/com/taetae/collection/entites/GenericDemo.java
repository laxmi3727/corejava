package com.taetae.collection.entites;

public class GenericDemo {
      static void main(String [] args) {
		
		
		add(10,20);
		add(11,22);
		add(33,44);
		add(55,65);
		add(75,85);
	 
	  
	Generic1 generic1 = new Generic1("abc");
	Generic2 generic2 =new Generic2(10);  
	
	System.out.println(generic1.getName());  
	System.out.println(generic2.getNumber()); 
	
	Generic<Integer> intGeneric= new Generic<>(1); 

	Generic<String> stringGeneric= new Generic<>("jhbs"); 
	
	Generic<Employee> employeeGneric = new Generic <> (new Employee(12,"jhb"));
	System.out.println(intGeneric.getT());
}
	public static void add(int number1,int number2) {
		System.out.println(number1+number2);
		
	}
}
