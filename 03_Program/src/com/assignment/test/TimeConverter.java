package com.assignment.test;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter time in minutes: ");
		int minutes = scanner.nextInt();

		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;

		System.out.println(minutes + " minutes is " + hours + " hours and " + remainingMinutes + " minutes.");
	}
}
