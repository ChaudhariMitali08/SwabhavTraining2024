package com.techlabs.model;

public class EmployeeDetails {
    private int employeeId;
    private String name;
    private int salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
