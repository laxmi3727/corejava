package com.taetae.moblieapp.presention;

import java.util.Scanner;
import java.util.Arrays;

public class MoblieUtility { 
	
	private static int Top; 
	
	static {
		
		top = -1;
	}
 
	private Mobile[] mobiles;
	
	public void setSize(Scanner scanner) {
		
		System.out.println("Enter size of your mobile stack");
		mobiles=new Mobile [scanner.nextInt()];
		
	}	
    public void printAllMobiles()	{  
    	
    	for(mobile mobile:mobiles)
    		
       System.out.println(mobile);
    }
     
    public int printMenu(Scanner scanner) { 
    	
    	System.out.println("1:Add Mobile Entry");
    	System.out.println("1: Update Mobile Entry");
    	System.out.println("1: Show Mobile Entry");
    	System.out.println("1: Show All Mobile Entry");
    	System.out.println("0: Exit");
    	return scanner.nextInt();
    }
    public void addMobileEntry(Scanner scanner) {
    	if(top<mobiles.length) {
         top++;
    	mobiles[top]=new Mobile();
    	System.out.println("Enter moblie Brand [samsung],[iphone],[nokia],");
    	mobiles[top].setBrand(scanner.next());
    	System.out.println("Enter moblie SerialNumber[samsung],[iphone],[nokia],");
    	mobiles[top].setSerialNumber(scanner.next());
    	System.out.println("Enter moblie os [Ios],[android],[Rim],");
    	mobiles[top].setOs(scanner.next());
        
    } else {
    	 System.out.println("Stack is Full...");
	}
    }
	public void deleteMoblieEntry() {
		if(top>=0) {
		mobiles[top--]=null;
		}
		else {
	    	 System.out.println("Stack is Empty..");
	}
}
	public void updateMobileEntry(Scanner scanner) {
		
		printAllMobiles();
		System.out.println("Enter serial Number to update moblie");
		int serialNumber=scanner.nextInt();
		for (int i=0;i<mobiles.length;i++);
		     if(mobile[i].getSerialNumber()==serialNumber) {
		    	 System.out.println("enter new  brand ");
		    	 mobiles [i].setBrand(scanner.nextInt());
		    	 System.out.println("enter new  os");
		    	 mobiles [i].setOs(scanner.nextInt());
		    	 
		     } 
		     else 
		    	 System.out.println("record not found..");
		     
		     
	  
	} 
	
	
	public void printMoblieEntry(Scanner scanner) {
		System.out.println("Enter serial Number to update moblie entry");
		int serialNumber=scanner.nextInt();
		for (int i=0;i<mobiles.length;i++);
		     if(mobile[i].getSerialNumber()==serialNumber) {
		    	 System.out.println("enter new  brand ");
		    	 mobile [i].setBrand(scanner.nextInt());
		    	 System.out.println("enter new  os");
		    	 mobile [i].setOs(scanner.nextInt());
		    	 
		     } 
		     else 
		    	 System.out.println("record not found..");
		
		
	}
	
	
	
}
