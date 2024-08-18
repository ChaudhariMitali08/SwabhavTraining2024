package com.aurionpro.model;

public class AreaCalculator {
	public double calculateAreaOfCircle(int radius)
	{
		return 3.14*radius*radius;
	}
	
	public double calculateAreaOfTriangle(int base,int height) {
		return 0.5*base*height;
	}
	
	public double calculateAreaOfRectangle(int breadth,int height) {
		return breadth*height;
	}
}
