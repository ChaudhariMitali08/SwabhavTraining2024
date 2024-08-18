package com.aurionpro.model;

import java.util.function.BooleanSupplier;

public class Operations {
	public int addition(int number1, int number2) {
		return number1 + number2;

	}

	int subtraction(int number1, int number2) {
		return number1 - number2;

	}

	int multiply(int number1, int number2) {
		return number1 * number2;
	}
	
	public int[] squareOfArrayElements(int numbers[])
	{
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=numbers[i]*numbers[i];
		}
		return numbers;
	}

	public Boolean isEven(int i) {
		
		return i%2==0;
	}
	public double division(int number1, int number2) {
		if(number2==0)
			throw new ArithmeticException();		
		return number1 / number2;
	}

	
}
