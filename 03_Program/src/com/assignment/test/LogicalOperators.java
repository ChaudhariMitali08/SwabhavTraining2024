package com.assignment.test;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter the Second Number: ");
		int number2 = sc.nextInt();

		boolean condition1 = number1 > number2;
		boolean condition2 = number1 < 100;
		System.out.println("1st condition value :- " + condition1);
		System.out.println("2nd condition value :- " + condition2);
		// true if both are true
		System.out.println(condition1 + " && " + condition2 + " -> " + (condition1 && condition2));
		// true if any one is true
		System.out.println(condition1 + " || " + condition2 + " -> " + (condition1 || condition2));
		// opposite value
		System.out.println("!" + condition1 + " -> " + (!condition1));
	}
}
