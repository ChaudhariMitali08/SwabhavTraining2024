package com.techlabs.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
			statement = connection.createStatement();
			System.out.println("Connection Successfull");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getEmployeeDetails() {
		try {
			ResultSet dbEmployeeData = statement.executeQuery("SELECT * FROM employee");
			while (dbEmployeeData.next()) {
				System.out.println(dbEmployeeData.getInt("empid") + "\t" + dbEmployeeData.getString("name") + "\t"
						+ dbEmployeeData.getDouble("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee ID:- ");
		int empid = scanner.nextInt();
		System.out.println("Enter the Employee Name:- ");
		String name = scanner.next();
		System.out.println("Enter the Employee Salary:- ");
		double salary = scanner.nextDouble();

		try {
			preparedStatement = connection.prepareStatement("INSERT INTO employee (empid,name,salary) VALUES(?,?,?)");
			preparedStatement.setInt(1, empid);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, salary);
			preparedStatement.executeUpdate();
			System.out.println("Employee Details Added Successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee Id ");
		int empid = scanner.nextInt();

		System.out.println("Enter new Nmae");
		String name = scanner.next();

		System.out.println("Enter new Salary");
		Double salary = scanner.nextDouble();

		// String updateQuery= "UPDATE employee SET name=?, salary=? WHERE empid=?";

		try {
			preparedStatement = connection.prepareStatement("UPDATE employee SET name=?, salary=? WHERE empid=?");
			preparedStatement.setString(1, name);
			preparedStatement.setDouble(2, salary);
			preparedStatement.setInt(3, empid);
			int rowsupdated = preparedStatement.executeUpdate();
			if (rowsupdated > 0) {
				System.out.println("Employee Data Updated");
			} else {
				System.out.println("No Employee found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee Id to delete ");
		int empid = scanner.nextInt();

		try {
			preparedStatement = connection.prepareStatement("DELETE FROM employee WHERE empid =?");
			preparedStatement.setInt(1, empid);

			int rowsDeleted = preparedStatement.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("Employee Deleted");
			} else {
				System.out.println("No Employee Found");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void closeConnection() {
		try {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}
			System.out.println("Connection Closed");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
