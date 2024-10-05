package com.taetae.definations;

public class BinarySearch {

	
public static void main(String[] args) {
		  
		int[] Array= {10,20,30,40,50,60};  
        int index = binarySearch(10, 10,20,30,40,50,60 );
		System.out.println( index );
}

  public static int binarySearch( int element , int... array) {
      int left=0;
      int right= array.length-1; 
      int mid=0;
      while (left<=right) {
    	  mid=(left+right)/2;
    	  if(element >array[mid])
    		  left=mid+1;
    	  else if(element == array[mid]) 
    		
    	      break;
    	      else 
    	    	  right=mid-1;
      }
      
      if(left>right)
    	  return -1; 
      
      return mid;
  }
}
