package com.assignment.test;

import java.util.Scanner;

public class ComparisonAssignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter the Second Number: ");
		int number2 = sc.nextInt();

		System.out.println("\nComparison Operators:");
		System.out.println(number1 + " == " + number2 + " -> " + (number1 == number2));
		// Not Equal
		System.out.println(number1 + " != " + number2 + " -> " + (number1 != number2));
		System.out.println(number1 + " > " + number2 + " -> " + (number1 > number2));
		System.out.println(number1 + " < " + number2 + " -> " + (number1 < number2));
		System.out.println(number1 + " >= " + number2 + " -> " + (number1 >= number2));
		System.out.println(number1 + " <= " + number2 + " -> " + (number1 <= number2));
	}
}