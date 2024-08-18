package com.techlabs.model;

public class StudentDetails {
	private int rollNo;
	private String name;
	private int age;
	private int percent;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		percent = percent;
	}

	public void grade() {
		if (percent >= 90) {
			System.out.println("Your Grade is A+");
		} else if (percent >= 80) {
			System.out.println("Your Grade is A");
		} else if (percent >= 70) {
			System.out.println("Your Grade is B+");
		} else if (percent >= 60) {
			System.out.println("Your Grade is B");
		} else if (percent >= 50) {
			System.out.println("Your Grade is C");
		} else if (percent < 35) {
			System.out.println("FAIL");
		}
	}

	public void display() {
		System.out.println("Roll No: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Percentage: " + percent);
	}
}