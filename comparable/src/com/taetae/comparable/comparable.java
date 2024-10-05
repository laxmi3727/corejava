package com.taetae.comparable;

import java.util.ArrayList;
import java.util.Collections;



public class comparable{
    public static void main(String[] args) {
        ArrayList<Student> studentArray = new ArrayList<>();
        studentArray.add(new Student("Pradnya", 101, 30000));
        studentArray.add(new Student("Laxmi", 103, 80000));
        studentArray.add(new Student("Pratik", 105, 40000));
        studentArray.add(new Student("Prachi", 102, 80000));
        studentArray.add(new Student("Vishal", 104, 70000));

        System.out.println("Inserted Data =" + studentArray);
        Collections.sort(studentArray);
        System.out.println("After sort=" + studentArray);
        
//        comparator sort using lambda Expression with custom mechanism
        studentArray.sort((e1,e2)-> e1.getName().compareTo(e2.getName()));
        System.out.println(studentArray);
        
        studentArray.sort((e1,e2)-> Integer.compare(e1.getFees(),e2.getFees()));
        System.out.println(studentArray);
        
        studentArray.sort((e1,e2)-> Integer.compare(e1.getRollNo(),e2.getRollNo()));
        System.out.println(studentArray);
        
     }
}
