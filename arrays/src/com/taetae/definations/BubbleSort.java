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

create table Address (
	    add_id INT primary key,
	    street varchar(20),
	    city varchar(22),
	    state varchar(20),
	    pincode varchar(10)
	);

	create table Student (
	    student_id int primary key,
	    name varchar(20),
	    age int,
	    add_id int,
	   foregin key (add_id) REFERENCES Add(add_id)
	);

	
	INSERT INTO Address (add_id, street, city, state, pincode) VALUES
	(1, 'Gr road', 'Mumbai', 'Maharashtra', '12345'),
	(2, 'tilak nagar', 'panji', 'goa', '67890'),
	(3, 'Abc', 'ujjain', 'mp', '11223');
