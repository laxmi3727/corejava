package com.taetae.definations;


public class SelectionSort {
 
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 5, 4};
        int arraySize = array.length; 
        
        System.out.println("Original array"); 
        for (int no : array) {
            System.out.print(no + "  ");
        }
        
        // Selection sort algorithm
        for (int i = 0; i < arraySize -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        
        System.out.println();
        System.out.println("Sorted array"); 
        for (int no : array) {
            System.out.print(no + "  ");
        }
    }
}
