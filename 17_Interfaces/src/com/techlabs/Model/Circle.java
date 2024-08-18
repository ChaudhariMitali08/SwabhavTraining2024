package com.techlabs.Model;

public class Circle implements Shape {
	private int radius;
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area of circle "+3.14*radius*radius);
	}
	
}
