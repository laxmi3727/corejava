package com.taetae.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class LinkedListExample {
 
	
	public static void main(String[] args) {
	  List<Integer> intLinkedList = new List<>();
		
		intLinkedList.add(10);
	  System.out.println(intLinkedList); 
	  
	  intLinkedList.remove(10); 
	  intLinkedList.remove(Integer.valueOf(10));
	  
	  boolean iscontains = intLinkedList.contains(25);
	  System.out.println(iscontains);
	}
}
