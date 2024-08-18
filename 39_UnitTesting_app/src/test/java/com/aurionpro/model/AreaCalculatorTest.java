package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
	
	AreaCalculator calculator;
	
	@BeforeEach
	public void init() {
		calculator = new AreaCalculator();
	}
	@Test
	public void calculateAreaOfCircle() {
		assertEquals(314, calculator.calculateAreaOfCircle(10));
	}
	
	@Test
	public void calculateAreaOfTriangle() {
		assertEquals(100, calculator.calculateAreaOfTriangle(10,20));
	}
	
	@Test
	public void calculateAreaOfRectangle() {
		assertEquals(600, calculator.calculateAreaOfRectangle(30,20));
	}
}
