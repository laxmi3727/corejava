package com.taetae.collection.list;
  import java.util.List;

import javax.print.attribute.IntegerSyntax;

import java.util.Arrays;
public class ArrayList {
    
	
	public static void main(String[]args) {
		
		ArrayList<Integer> intArrayList = new ArrayList<>();
		intArrayList.add(1);
		System.out.println(intArrayList); 
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("abc"); 
		
		System.out.println(stringList.toString());
	
    
	for (int i=0; i<stringList.size()i++)
		System.out.println(stringList.get(i));

    for (int number : intArrayList) 
    	System.out.println(number); 
    
    stringList.forEach(System.out::println);    
    
    stringList.stream() .forEach(System.out::println); 
     
    Iterator<integer> intIterartor= intArrayList.iterator();
    while(intIterator.hasNext()) { 
    	int number= intIterator.next();
    	System.out.println(Integer.toBinaryString(number));
    	
    }
    
    int number1= intArrayList.get();
    Integer removeElement=5;
     
    intArrayList.remove(removeElement);
    system.out.println(intArrayList); 
    
     intArrayList.set(2,33);
    system.out.println(intArrayList);
    
    intArrayList.add(33,53);
    system.out.println(intArrayList); 
    
    intArrayList.addAll(Arrays.aslist(1,2,3,4,5));
    system.out.println(intArrayList); 
    
    int[] intArray= {1,2,3,4,5};
    printArray(intArray);  
    
     
	} 
	
	
    public static void printArray(int...arr) {
    	System.out.println()
    	
    }
}
