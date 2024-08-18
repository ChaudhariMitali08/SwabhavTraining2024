package com.techlabs.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionManagement {
	private Connection connection = null;
	private Statement statement = null;

	// private PreparedStatement preparedStatement = null; Scanner scanner = new
	// Scanner(System.in);
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "root");
			connection.setAutoCommit(false);
			statement = connection.createStatement();
			System.out.println("Connection Successful");
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO personaldetails (name, id, salary) VALUES (?, ?, ?)");
			preparedStatement.setString(1, "John");
			preparedStatement.setInt(2, 1);
			preparedStatement.setInt(3, 7000);
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void getpersonaldetails() {
		try { // Ensure the table name in the query matches the actual table name
			ResultSet dbpersonalData1 = statement.executeQuery("SELECT * FROM personaldetails");
			while (dbpersonalData1.next()) {
				// Replace column names and indices with actual ones in your table
				// System.out.println(dbpersonalData1.getString("name") + "\t" +
				// dbpersonalData1.getInt("id") + "\t" + dbpersonalData1.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}