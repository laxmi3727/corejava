package com.taetae.definations;

public class Matix2D {
 
	
	public static void main(String[] args) { 
		 
    int[][] matrix = new int [3][3]; 
    
     matrix[0] = new int[] {1,2,3};
     matrix[1] = new int[] {4,5,6};
     matrix[2] = new int[] {7,8,9};
     
     for(int i=0; i<matrix.length; i++) {
    	 
    	for(int j=0;j<matrix[i].length;j++) {
    		
    		System.out.print(matrix[j][i]+ " ");
    		
    	}
    	
     
     
     System.out.println(" ");
     
     }
	}
	
}
    
