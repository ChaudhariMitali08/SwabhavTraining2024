package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	public Connection connection = null;
	public Statement statement = null;
	public PreparedStatement preparedStatement;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
			statement = connection.createStatement();
			System.out.println("connection successfull");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void getstudentdetails() {
		try {
			ResultSet dbstudentsdata = statement.executeQuery("select * from students");
			while (dbstudentsdata.next()) {
				System.out.println(dbstudentsdata.getInt(1) + "\t" + dbstudentsdata.getString("name") + "\t"
						+ dbstudentsdata.getInt("age") + "\t" + dbstudentsdata.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number");
		int rollnumber = sc.nextInt();

		System.out.println("Enter Name");
		String name = sc.next();

		System.out.println("Enter Age");
		int age = sc.nextInt();

		System.out.println("Enter Percentage");
		double percentage = sc.nextDouble();

		try {
			preparedStatement = connection.prepareStatement("insert into students values(?,?,?,?)");
			preparedStatement.setInt(1, rollnumber);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setDouble(4, percentage);
			preparedStatement.executeUpdate();

			System.out.println("Records Added Successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// try {
		// statement.executeUpdate("insert into students
		// values("+rollnumber+",'"+name+"',"+age+","+percentage+")");
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	public void updateStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter roll number of the student to update:");
		int rollnumber = sc.nextInt();

		System.out.println("Enter new Name:");
		String name = sc.next();

		System.out.println("Enter new Age:");
		int age = sc.nextInt();

		System.out.println("Enter new Percentage:");
		double percentage = sc.nextDouble();

		String updateQuery = "UPDATE students SET name = ?, age = ?, percentage = ? WHERE rollnumber = ?";

		try {
			preparedStatement = connection.prepareStatement(updateQuery);

			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, age);
			preparedStatement.setDouble(3, percentage);
			preparedStatement.setInt(4, rollnumber);

			int rowsAffected = preparedStatement.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Student details updated successfully.");
			} else {
				System.out.println("No student found with the roll number: " + rollnumber);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteStudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter roll number of the student to delete:");
		int rollnumber = sc.nextInt();

		String delete = "DELETE FROM students WHERE rollnumber = ?";

		try {
			preparedStatement = connection.prepareStatement(delete);
			preparedStatement.setInt(1, rollnumber);

			int deleted = preparedStatement.executeUpdate();

			if (deleted > 0) {
				System.out.println("Student deleted successfully.");
			} else {
				System.out.println("No student found with the roll number: " + rollnumber);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}