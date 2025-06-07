package com.taetae.definations;

public class BubbleSort {
	

	    public static void main(String[] args) {
	        int[] arr = {20, 50, 10, 30, 40};
	        int key = 30;
	        int left = 0;
	        int right = arr.length - 1;
	        int result = -1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == key) {
	                result = mid;
	                break;
	            }

	            if (arr[mid] < key) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }

	        if (result == -1) {
	            System.out.println("element not found in array");
	        } else {
	            System.out.println("element found at index: " + result);
	        }
	    }
	}

