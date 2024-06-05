package com.taetae.arithmaticoperation;

public class ArithmaticOperationService {  
	
	ArithmaticOperation obj1=new ArithmaticOperation ();
	ArithmaticOperation obj2=new ArithmaticOperation(40,30);
	
    public void addition() {
    	
    	obj1.addition();
    	obj2.addition(); 	
    }
    
    public void subtraction() {
    	obj1.subtraction();
    	obj2.subtraction();
    }
    
    public void multiplication() {
    	obj1.multiplication();
    	obj2.multiplication();
    }
}
