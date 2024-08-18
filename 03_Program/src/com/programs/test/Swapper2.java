package com.programs.test;

public class Swapper2 {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		number1 = number1 +number2;
		number2 = number1 - number2;
		number1= number1 -number2;
		System.out.println("after swapping " +number1 +"and " +number2);
	}
}
