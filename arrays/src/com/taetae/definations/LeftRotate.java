package com.taetae.definations;

 
	 import java.util.Scanner;

	 class LeftRotate {
	     public static void main(String[] args) {
	         Scanner scanner = new Scanner(System.in);

	         // Input: number of rows for the triangle
	         System.out.print("Enter the number of rows: ");
	         int rows = scanner.nextInt();

	         // Loop to print the triangle
	         for (int i = 1; i <= rows; i++) {
	             // Print stars
	             for (int j = 1; j > i; j++) {
	                 System.out.print("*");
	             }
	             // Move to the next line
	             System.out.println();
	         }

	         scanner.close();
	     }
	 }
