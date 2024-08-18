package com.techlabs.Model;

public class Rectangle implements Shape {
		private int length;
		private int breadth;
		
		
	public Rectangle(int length, int breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle:- "+length*breadth);
	}

}
