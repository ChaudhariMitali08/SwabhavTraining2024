package com.techlabs.Model;

public class Student extends Person {
	private int rollno;
	private double percentage;

	public Student(String name, String address, int age,int rollno, double percentage) {
	    super(name,address,age);
		this.rollno = rollno;
		this.percentage = percentage;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", percentage=" + percentage + ", Rollno=" + getRollno()
				+ ", Percentage=" + getPercentage() +", Address=" + getAddress() + "]";
	}

}
