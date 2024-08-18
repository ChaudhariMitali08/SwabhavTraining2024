package com.techlabs.test;

import com.techlabs.model.EmployeeDetails;

public class EmployeeDetailsTest {
    public static void main(String[] args) {
        EmployeeDetails employee1 = new EmployeeDetails();
        employee1.setEmployeeId(70);
        employee1.setName("Mitali ");
        employee1.setSalary(50000);

        EmployeeDetails employee2 = new EmployeeDetails();
        employee2.setEmployeeId(66);
        employee2.setName("Chaudhari");
        employee2.setSalary(60000);

        System.out.println("Details of Employee 1:");
        employee1.displayDetails();

        System.out.println("\nDetails of Employee 2:");
        employee2.displayDetails();
    }
}
