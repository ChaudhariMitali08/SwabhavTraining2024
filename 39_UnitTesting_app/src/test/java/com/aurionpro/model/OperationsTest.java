package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperationsTest {
	Operations operations;

	@BeforeEach
	void init() {
		operations = new Operations();
	}
	
	@AfterEach
	void status()
	{
		System.out.println("test finished");
	}

	@Test
	public void testAddition() {
		assertEquals(30, operations.addition(10, 20),"This method must perform addition");
	}

	@Test
	public void testSubtraction() {
		assertEquals(20, operations.subtraction(30, 10));
	}

	@Test
	public void testMultiply() {
		assertEquals(300, operations.multiply(30, 10));
	}

	@Test
	public void testSquareOfArrayElements() {
		int squares[]= {25,36,49};
		int numbers[]= {5,6,7};
		assertArrayEquals(squares,operations.squareOfArrayElements(numbers));
		
	}
	@Test
	public void testisEven() {
		assertTrue(operations.isEven(6));
		assertFalse(operations.isEven(7));
	}
	
	@Test
	public void testDivision() {
		assertEquals(2.0, operations.division(20, 10));
		assertThrows(ArithmeticException.class,()-> operations.division(10,0));

	}
	
	
	
}
