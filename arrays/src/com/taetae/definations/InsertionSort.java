package com.taetae.definations;

public class InsertionSort {

	
	public static void main(String[]args) { 
		
		int[] array= {3,5,1,2,4,9,6};
		
		
		System.out.println("original array"); 
		
		for(int no : array)  
	
			System.out.print(no + "  ");
		
		
		int j=0;
		int key=0;
		int temp=0;
		
		for (int i=1; i<array.length; i++) {
			j=i-1;
			key=j;
			while(j>=0 && array[key]>array[j+1]) {
				
				temp=array[key];
				array[j]=array[j+1];
				array[j+1]=temp;
				j--;
				key--;
			}
		}
		
		System.out.println();
         System.out.println("sorted array"); 
		
		for(int no : array)  
	
			System.out.print(no + "  ");
	}
} 
