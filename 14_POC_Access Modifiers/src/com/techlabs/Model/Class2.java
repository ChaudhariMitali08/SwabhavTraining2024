package com.techlabs.Model;

public class Class2 {
	public void exampleMethod() {
		Parent parent = new Parent();
		int a = parent.defaultField;
		parent.defaultMethod(); 
//		parent.protectedField();
//		parent.publicField();
//		 parent.privateMethod(); 
	}

	public static void main(String[] args) {
		Class2 anotherClass = new Class2();
		anotherClass.exampleMethod();
	}
}
