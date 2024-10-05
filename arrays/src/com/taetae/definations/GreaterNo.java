package com.taetae.definations;


public class GreaterNo{ 
	
	public static void main(String[] args) {
		int[] array = {10, 89, 56, 9, 8};
		
		int greatest = array[0]; // Assume the first element as the greatest
		int greatestIndex = 0;    // Index of the greatest number
		int smallest = array[0]; // Assume the first element as the greatest
		int smallestIndex = 0; 
		for (int i = 1; i < array.length; i++) {
			if (array[i] > greatest) {
				greatest = array[i];
				greatestIndex = i;
			}
			if (array[i] < smallest) {
				smallest = array[i];
				smallestIndex = i;
			}
			
		}
		
		System.out.println("Greatest number: " + greatest);
		System.out.println("Index of greatest number: " + greatestIndex);
		System.out.println("smallest number: " + smallest);
		System.out.println("Index of smallest number: " + smallestIndex);
	}
}
