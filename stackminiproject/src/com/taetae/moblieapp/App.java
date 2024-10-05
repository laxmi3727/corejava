package com.taetae.moblieapp;

import java.util.Scanner;
public class App {
 
	public static void main (String []args) {
	Scanner scanner=new scanner (System.in);	
	MoblieUtility=new moblie MoblieUtility
		utility.setsize(scanner);
	   utility.printAllmobiles(); 
	        
	        int choice=0;
	        do {
	        	
	        	System.out.println(" ");
	        	 choice=utility.printMenu(scanner);
	        	switch(choice) {
	        	
	        	case1->utility.addMobileEntry(scanner);
	        	case2->System.out.println("UpdateEntry");
	        	case3->System.out.println("DeleteEntry");
	        	case4->System.out.println("PrintEntry");
	        	case5->utility.add MobileEntry(scanner);
	        	case0->System.out.println("bye....");
	        	default->System.out.println("Invalid");
	        	}
	        	
	        }
	        
	        while(choice!=0);
	}
}
