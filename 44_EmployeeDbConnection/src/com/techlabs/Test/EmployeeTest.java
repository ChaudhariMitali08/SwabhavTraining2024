package com.techlabs.Test;

import java.util.Scanner;

import com.techlabs.Model.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee connection = new Employee();
		Scanner scanner = new Scanner(System.in);
		connection.connectToDb();

		while (true) {
			System.out.println("Menu");
			System.out.println("1. Display Employee Details");
			System.out.println("2. Add Employee");
			System.out.println("3. Update Employee ");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");

			System.out.println("Enter an option:- ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:connection.getEmployeeDetails();
			break;
			case 2:connection.addEmployee();
			break;
			case 3:connection.updateEmployee();
			break;
			case 4:connection.deleteEmployee();
			break;
			case 5:System.out.println("Exit");
			connection.closeConnection();
			scanner.close();
			return;
			default:System.out.println("Invalid choice. ");
			}
		}
	}
}
