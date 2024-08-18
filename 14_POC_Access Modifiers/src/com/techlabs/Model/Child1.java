package com.techlabs.Model;

public class Child1 extends Parent {
	public void exampleMethod() {
		// Inherited fields and methods accessible in subclass
		int a = protectedField;
		protectedMethod();

		int b = publicField;
		publicMethod();

//		int c = privateField;
		defaultMethod();

	}

	public static void main(String[] args) {
		Child1 child = new Child1();

		int a = child.protectedField;
		child.protectedMethod();

		int b = child.publicField;
		child.publicMethod();

//		int c = child.privateField;
//		child.privateMethod();

		int d = child.defaultField;
		child.defaultMethod();
	}
}
