package com.techlabs.Test;

import com.techlabs.Model.*;
import java.util.Scanner;

public class SCMTest {
	public static void main(String[] args) {
		SCM connection = new SCM();
		Scanner scanner = new Scanner(System.in);
		connection.connectToDb();
		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Insert into Suppliers");
			System.out.println("2. Insert into Products");
			System.out.println("3. Insert into Orders");
			System.out.println("4. Insert into Order Details");
			System.out.println("5. Insert into Inventory");
			System.out.println("6. Fetch from Suppliers");
			System.out.println("7. Fetch from Products");
			System.out.println("8. Fetch from Orders");
			System.out.println("9. Fetch from Order Details");
			System.out.println("10. Fetch from Inventory");
			System.out.println("11. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				connection.insertIntoSuppliers();
				break;
			case 2:
				connection.insertIntoProducts();
				break;
			case 3:
				connection.insertIntoOrders();
				break;
			case 4:
				connection.insertIntoOrderDetails();
				break;
			case 5:
				connection.insertIntoInventory();
				break;
			case 6:
				connection.fetchFromSuppliers();
				break;
			case 7:
				connection.fetchFromProducts();
				break;
			case 8:
				connection.fetchFromOrders();
				break;
			case 9:
				connection.fetchFromOrderDetails();
				break;
			case 10:
				connection.fetchFromInventory();
				break;
			case 11:
				connection.closeConnection();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
	}
}