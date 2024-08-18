package com.assignment.test;
import java.util.*;
public class TrapezoidAreaCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of the first base: ");
		double base1 = sc.nextDouble();

		System.out.print("Enter the length of the second base: ");
		double base2 = sc.nextDouble();

		System.out.print("Enter the height: ");
		double height = sc.nextDouble();

		double area = ((base1 + base2) / 2) * height;
		System.out.println("The area of the trapezoid is: " + area);

	}
}