package com.assignment.test;

import java.util.*;

public class BmiCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter weight in kilograms: ");
		double weight = sc.nextDouble();

		System.out.print("Enter height in meters: ");
		double height = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("Your BMI is: " + bmi);

	}
}