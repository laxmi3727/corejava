package com.taetae.arithmaticoperation;

public class ArithmaticOperation {  
	
	int operand1;
	int operand2;
	
	ArithmaticOperation()
	{ 
		operand1=20;
		operand2=10;
	}
	 
    ArithmaticOperation(int Num1, int Num2) 
    {
        operand1=Num1;
        operand2=Num2;
    } 
    
    void addition(){ 
    	
    	System.out.println("Add="+ (operand1+operand2));
    	
    }
    
    void subtraction(){   
    	
    	System.out.println("SUB="+ (operand1-operand2));
    }
    
    void multiplication() {
    	
    	System.out.println("MUL="+ (operand1*operand2));
    	
    }
}


