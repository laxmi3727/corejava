 package com.taetae.interfaces.lambdaexpression.main;

import com.taetae.interfaces.lambdaexperssion.Animal;

public class MainAnimal {
      
	public static void main (String[] args) {
		
		Animal dog = noise -> noise;
		
		System.out.println(dog.makeNoise("bark"));
		  
		
		Animal cat = noise -> noise;
		
		System.out.println(cat.makeNoise("meow meow"));  
		
		Animal snake =noise -> noise ;
		
		System.out.println(snake.makeNoise("hissssss"));
		
		
	}
}
