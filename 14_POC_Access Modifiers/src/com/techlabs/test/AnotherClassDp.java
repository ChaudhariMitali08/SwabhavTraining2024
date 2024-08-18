package com.techlabs.test;

import com.techlabs.Model.Parent;

public class AnotherClassDp {
	public void exampleMethod() {
		Parent parent = new Parent();

		int b = parent.publicField;
		parent.publicMethod();

//		int a = parent.protectedField;
//		parent.protectedMethod();
//		
//		int c = parent.privateField; 
//		parent.privateMethod();
//		
//		int d = parent.defaultField;
//		parent.defaultMethod();
	}

	public static void main(String[] args) {
		AnotherClassDp anotherClass = new AnotherClassDp();
		anotherClass.exampleMethod();
	}
}
