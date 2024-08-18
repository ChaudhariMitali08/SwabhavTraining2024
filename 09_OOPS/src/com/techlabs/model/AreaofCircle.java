package com.techlabs.model;
public class AreaofCircle {
    private double pi;
    private double radius;
    
    
    public AreaofCircle(double r) {
    	radius = r;
    }
    public void initialize(double r) {
        pi = 3.14;
        radius = r;
    }

    public void display() {
        System.out.println("Area of Circle: " + calculateArea());
    }

    public double calculateArea() {
        return pi * radius * radius;
    }
}
