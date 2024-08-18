package com.techlabs.model;

public class Box {
	private int width;
	private int height;
	private int depth;
	
//Default	
//	public Box() {
//		width=10;
//		height=20;
//		depth =30;
//	}
	
//Parameterised
//  public Box(int h, int w,int d) {
//	height =r;
//	width=w;
//	depth=d;
//}
	
	public Box() {
		
		this.width=width;
		this.height =height;
		this.depth=depth;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width=width;
	}
	public int getheight() {
		return height;
	}
	public void setheight(int height) {
		 this.height=height;
	}
	public int getdepth() {
		return depth;
	}
	public void setdepth(int d) {
		 this.depth=depth;
	}
	public void display() {
		System.out.println("width = " + width);
		System.out.println("height" + height);
		System.out.println("depth" + depth);
	}

	public int calculateArea() {
		return width * height * depth;
	}

}
