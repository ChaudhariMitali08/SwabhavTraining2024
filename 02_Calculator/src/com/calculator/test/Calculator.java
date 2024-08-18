package com.calculator.test;

public class Calculator {
	int a = 20;
	int b = 10;

	public int addition() {
		return a + b;
	}
	
	public int subtraction() {
		return a - b;
	}
	
	public int multiplication() {
		return a * b;
	}
	
	public int division() {
		return a / b;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println("Addition of a & b :- "+cal.addition());
		System.out.println("Subtraction of a & b :- "+cal.subtraction());
		System.out.println("Multiplication of a & b :- "+cal.multiplication());
		System.out.println("Division of a & b :- "+cal.division());
	}
}
