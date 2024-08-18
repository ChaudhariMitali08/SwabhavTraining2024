package com.techlabs.test;

import com.techlabs.model.AreaofCircle;
import java.util.*;
public class AreaofCircleTest {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the radius of circle :- ");
    	double r = sc.nextDouble();
        AreaofCircle area = new AreaofCircle(r);
        area.initialize(r);
        System.out.println("Area: " + area.calculateArea());
    }
}
