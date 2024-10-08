package com.aurionpro.structural.composite.test;

import com.aurionpro.structural.composite.model.IndividualStudent;
import com.aurionpro.structural.composite.model.Student;
import com.aurionpro.structural.composite.model.StudentGroup;

//Client
public class CompositePatternStudentDemo {
 public static void main(String[] args) {
     // Create individual students
     Student student1 = new IndividualStudent("Alice", 1);
     Student student2 = new IndividualStudent("Bob", 2);
     Student student3 = new IndividualStudent("Charlie", 3);

     // Create a group of students
     StudentGroup group1 = new StudentGroup();
     group1.add(student1);
     group1.add(student2);

     // Create another group and add a student and the previous group
     StudentGroup group2 = new StudentGroup();
     group2.add(student3);
     group2.add(group1);

     // Display details
     System.out.println("Group 1 details:");
     group1.showDetails();

     System.out.println("\nGroup 2 details:");
     group2.showDetails();
 }
}

