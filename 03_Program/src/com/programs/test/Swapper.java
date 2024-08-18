package com.programs.test;

public class Swapper {
	public static void main(String[] args) {

		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);

		int number3 = number1;
		number1 = number2;
		number2 = number3;

		System.out.println("after swapping " + number1 + " and " + number2);

	}
}
