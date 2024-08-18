package com.techlabs.Test;

import com.techlabs.Model.*;

public class DemoStaticTest {
	
	
	public static void main(String[] args) {
		Demo demo1 = new Demo();
		
		demo1.display();
		DemoStatic.increment(); // if static method then use classname.method
		demo1.display();

		Demo demo2 = new Demo();
		demo2.display();
		demo2.increment();
		demo2.display();

		Demo demo3 = new Demo();
		demo3.display();
		demo3.increment();
		demo3.display();

	}
//	static {
//		System.out.println("ssssssss");
//	}
//	static {
//		System.out.println("ddddd");
//	}
	
}
