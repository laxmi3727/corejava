package com.taetae.definations;

public class InsertionSortString {

		
		public static void main(String[]args) { 
			
			String[] StringArray= {"Taehyuang","Jungkook","Namjoon" ,"Jimin","Suga","Jin","Jhope"};
			
			
			System.out.println("original array"); 
			
			for(String no: StringArray)  
		
				System.out.print(no + "  ");
			
			
			int j=0;
			int key=0;
			
			String temp;
			for (int i=1; i<StringArray.length; i++) {
				j=i-1;
				key=j;
				while(j>=0 &&  StringArray[key].compareTo(StringArray[j+1])>0) {
					
					temp=StringArray[key];
					StringArray[j]=StringArray[j+1];
					StringArray[j+1]=temp;
					j--;
					key--;
				}
			}
			
			System.out.println();
			System.out.println("Sorted array"); 
			for (String no : StringArray)  
			    System.out.print(no + "  ");


	}
	}
	