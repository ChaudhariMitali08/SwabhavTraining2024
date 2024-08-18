package com.techlabs.Model;

import com.techlabs.Exceptions.AgeNotValidException;

public class Voter {
	private int voterId;
	private String firstName;
	private String lastName;
	private int age;

	public Voter(int voterId, String firstName, String lastName, int age) {
		super();
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		try {
			if (age < 18)
				throw new AgeNotValidException();
			this.age = age;
		} catch (AgeNotValidException exception) {
			System.out.println(exception.getMesage());
		}
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}

	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}

}
