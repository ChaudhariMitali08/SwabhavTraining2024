package com.techlabs.test;

import java.util.*;

import com.techlabs.model.StudentDetails;

public class StudentDetailsTest {
	public static void main(String[] args) {
		StudentDetails box1 = new StudentDetails();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll Number");
		int rollNo = sc.nextInt();
		box1.setRollNo(rollNo);

		System.out.println("Enter Name");
		String name = sc.next();
		box1.setName(name);
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		box1.setAge(age);

		System.out.println("Enter Percentage");
		int percent = sc.nextInt();
		box1.setPercent(percent);
		
		box1.display();
		box1.grade();
		
		
	}
}