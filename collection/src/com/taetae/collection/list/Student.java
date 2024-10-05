package com.taetae.collection.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
 

	    private int id;
	    private String name;

	    public Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Student student = (Student) obj;
	        return id == student.id && name.equals(student.name);
	    }

	    @Override
	    public int hashCode() {
	        int result = Integer.hashCode(id);
	        result = 31 * result + name.hashCode();
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
	    }
	

	
	    public static void main(String[] args) {
	        Set<Student> stuLinkedHashSet = new LinkedHashSet<>();
	        Set<Student> stuLinkedHashSet1 = new LinkedHashSet<>(20);
	        Set<Student> stuLinkedHashSet2 = new LinkedHashSet<>(30, 0.87f);

	        stuLinkedHashSet.add(new Student(1, "abc"));
	        stuLinkedHashSet.add(new Student(2, "xyz"));
	        stuLinkedHashSet.add(new Student(3, "kam"));
	        stuLinkedHashSet.add(new Student(4, "park"));
	        stuLinkedHashSet.add(new Student(5, "kim"));

	        System.out.println(stuLinkedHashSet);  
	        
	        stuLinkedHashSet.remove(new Student(3, "kam"));
	        System.out.println(stuLinkedHashSet);   
	        
	        System.out.println(stuLinkedHashSet.isEmpty());  
	        
	        System.out.println(stuLinkedHashSet.contains(new Student(5, "kim"))); 
	       
	    }
	}

	

