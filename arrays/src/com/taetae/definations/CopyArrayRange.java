package com.taetae.definations;

import java.util.Arrays;

public class CopyArrayRange {
 
	
	 public static void main(String []args ) { 
		 
		 int[] srcArray= {1,3,2,4,5,6,9};
		 int[] destArray= copyArrayInRange(srcArray,1,2);  
		 
		 System.out.println(Arrays.toString(destArray));
		 
	 } 
	 
	 public static int[] copyArrayInRange(int[] sourceArray, int StartPosition,int endPosition) { 
		 
		 int[] destinationArray= new int [(endPosition +1 ) - StartPosition];
		 
		 for (int i=StartPosition,j=0; i<=endPosition; i++ ,j++)
			 destinationArray[j]=sourceArray[i];
		 return destinationArray;
				 
	 }
}


