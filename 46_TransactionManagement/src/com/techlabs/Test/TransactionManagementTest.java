package com.techlabs.Test;

import com.techlabs.Model.*;

public class TransactionManagementTest {
	public static void main(String[] args) {
		TransactionManagement connection = new TransactionManagement();
		connection.connectToDb();
		connection.getpersonaldetails();
	}
}