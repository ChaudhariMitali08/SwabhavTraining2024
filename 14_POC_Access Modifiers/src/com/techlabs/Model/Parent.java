package com.techlabs.Model;

public class Parent {
    private int privateField;
    int defaultField;
    protected int protectedField;
    public int publicField;

    public Parent() {
        privateField = 10;
        defaultField = 20;
        protectedField = 30;
        publicField = 40;
    }

    private void privateMethod() {
        System.out.println("Private method called");
    }

    void defaultMethod() {
        System.out.println("Default method called");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    public void publicMethod() {
        System.out.println("Public method called");
    }
}
