package com.taetae.interfaces.demo.main;

import com.taetae.interfaces.demo.Validator;
import com.taetae.interfaces.demo.implementation.ValidAge;

public class MainValidator {
   
	public static void main(String [] args) {
	Validator validAge= new ValidAge();
			 

	        String Age = "10";
	        if (validAge.isvalid(Age)) {
	            System.out.println(Age +"The age  is valid.");
	        } 
	        else 
	        {
	            System.out.println(Age +"The age is invalid.");
	        }
}
}