package com.taetae.definations;


public class LinearSearch {
    public static int linearSearch(int[] arr,int key){
    	
    	for(int i=0; i< arr.length;i++) { 
    		 
    		if(arr[i]==key) { 
    			return i;
    		}
    		
    		
    	} 
    	return -1;
    } 
    
    public static void main (String [] args) { 
    	
    	int[] array= {10,30,20,40,60,70};
    	int key=20;
    	
    	int result = linearSearch(array , key); 
    	
    	if(result !=-1) { 
    		System.out.println("Element " +  key  +  " Found at index "  +  result);
    	} 
    	
    	else {
    		
    		System.out.println("Element"  + key + "Not Found At index" + result);
    	}
    	
    }
}
