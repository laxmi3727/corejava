package com.taetae.collection.list;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubsetExample {
      
	public static void main(String[] args) {
		//initial  capacity 16 hashtable
		//Set<Integer> intSet = new HashSet<>();
		//provide Initial capacity 
		//Set<Integer> intset = new HashSet<>(32);
		//provide intial capacity and load factor 
		SortedSet<Integer> intSet=new TreeSet<>();
	     intSet.add(4); 
	     intSet.add(3);
	     intSet.add(2);
	     intSet.add(1);
	     intSet.add(7);
	     intSet.add(8);
	     
	     System.out.println(intSet);
	     
	     Set<Integer> subSet= intSet.subSet(4,8);
	     System.out.println(subSet);
	}
}
