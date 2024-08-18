package com.techlabs.Test;

import com.techlabs.Model.Circle;
import com.techlabs.Model.Shape;
import com.techlabs.Model.Rectangle;

public class ShapeTest {
	public static void main(String[] args) {
		
		Shape shape;
		shape = new Circle(20);
		shape.area();
		shape= new Rectangle(20,10);
		shape.area();
	}
}
