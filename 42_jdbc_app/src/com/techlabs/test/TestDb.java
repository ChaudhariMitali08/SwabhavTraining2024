package com.techlabs.test;

import com.techlabs.model.DbConnection;

public class TestDb {
	public static void main(String[] args) {
		DbConnection connection = new DbConnection();
		connection.connectToDb();
		connection.getstudentdetails();
//		connection.addStudent();
//		connection.getstudentdetails();
//		connection.updateStudent();
//		connection.getstudentdetails();
		connection.deleteStudent();
		connection.getstudentdetails();

	}
}