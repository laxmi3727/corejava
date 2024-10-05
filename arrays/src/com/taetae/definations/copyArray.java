package com.taetae.definations;

import java.util.Arrays;

public class copyArray {
 
	
	public static void main(String []args) {
		
		
		int[] srcArray = {3,7,9,85,76};
		
	    int[] DestArray = new int[5]; 
	    deepcopy(srcArray , DestArray); 
	    
	    System.out.println(Arrays.toString(DestArray));
	}
	 

	public static void deepcopy(int [] srcArray ,  int[] DestArray) {
	    for (int i = 0; i<DestArray.length; i++)
	    	
	    	if(i<srcArray.length)
	    		
	    		DestArray[i]=srcArray[i];
	    	else 
	    		
	    		DestArray[i]=0;
	    }
	}

