package com.techlabs.Model;

public class DemoStatic {

	private static int a = 1;
	private static int b= 1;
	private static int c= 1;
	
	public static void increment() {
		a++;
		b++;
		c++;
	}
	
	public void display() {
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);

	}
	
	
}
