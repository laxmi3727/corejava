package com.taetae.recursion;

public class RecursionAddition {
  
	public void printExpression(String expression, int no) {
		
		if (no<=0) {
			System.out.println(expression);
			return;
		} 
		
		if (expression.equals("")) {
			 expression=no+" ";
			
		}
		else {
			expression=expression+"+"+no;
		}
		
		switch(no){  
			
			case 1: 
				printExpression(expression, no-1); 
			break;
			
			default: {
				
				printExpression(expression, no-1);
				printExpression(expression, no-2);
			}
			
		}
		
	}
}

