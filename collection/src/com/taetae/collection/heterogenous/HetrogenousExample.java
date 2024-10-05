package com.taetae.collection.heterogenous;

import java.util.ArrayList;
import java.util.List;

public class HetrogenousExample {
   
	public static void main(String[]args) {
	
	List list = new ArrayList <>(5);
	
	list.add(10);
	list.add("abc"); 
	list.add(new Empolyee(1,"Xzy"));
	
	System.out.println(list); 
	
	int[] intArray= {1,2,3};
	int length=intArray.length;
	
	
}
}