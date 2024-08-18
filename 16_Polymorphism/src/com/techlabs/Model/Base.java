package com.techlabs.Model;

public class Base {
	public void display() {
		System.out.println("Inside Base");
	}
}
class Derived1 extends Base{
	public void display() {
		System.out.println("Inside Derived1");
	}
}
class Derived2 extends Base{
	public void display() {
		System.out.println("Inside Derived2");
	}
}