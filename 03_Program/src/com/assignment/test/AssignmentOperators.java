package com.assignment.test;

import java.util.Scanner;

public class AssignmentOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter the Second Number: ");
		int number2 = sc.nextInt();

		double result = number1;
		System.out.println("Initial result: " + result);

		result += number2;
		System.out.println(" += " + number2 + ": " + result);

		// Subtraction assignment
		result -= number2;
		System.out.println(" -= " + number2 + ": " + result);

		// Multiplication assignment
		result *= number2;
		System.out.println(" *= " + number2 + ": " + result);

		// Division assignment
		result /= number2;
		System.out.println(" /= " + number2 + ": " + result);

		// Modulus assignment
		result %= number2;
		System.out.println(" %= " + number2 + ": " + result);
	}
}
