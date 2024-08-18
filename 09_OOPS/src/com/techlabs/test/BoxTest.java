package com.techlabs.test;

import java.util.*;
import com.techlabs.model.Box;

public class BoxTest {
	public static void main(String[] args) {
		Box box1 = new Box();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter width");
		int width = sc.nextInt();
		box1.setwidth(width);

		System.out.println("Enter height");
		int height = sc.nextInt();
		box1.setheight(height);
		
		System.out.println("Enter depth");
		int depth = sc.nextInt();
		box1.setdepth(depth);

		System.out.println("area " + box1.calculateArea());

	}
}
