package com.techlabs.test;

import com.techlabs.model.*;

import java.util.Arrays;
import java.util.Scanner;

import com.techlabs.model.*;

public class BankAccountTestApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Bank Accounts:- ");
		int n = sc.nextInt();
		BankAccountApp[] accounts = new BankAccountApp[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Account Number:");
			int accountNumber = sc.nextInt();

			System.out.println("Enter Name:");
			String name = sc.next();

			System.out.println("Enter Initial Balance:");
			int balance = sc.nextInt();

			System.out.println("Enter the type of the Account:- ");
			String accountType = sc.next();
			accounts[i] = new BankAccountApp(accountNumber, name, balance, accountType);

		}
		Arrays.sort(accounts, (b1, b2) -> b2.getBalance() - b1.getBalance());
		BankAccountApp maxBalanceAccount = accounts[0];

		System.out.println("\nAccount with Maximum Balance:");
		System.out.println("Account Number: " + maxBalanceAccount.getAccountNumber());
		System.out.println("Name: " + maxBalanceAccount.getName());
		System.out.println("Balance: " + maxBalanceAccount.getBalance());
		System.out.println("Account Type: " + maxBalanceAccount.getAccountType());

	}
}

//
//
// boolean exit = false;
// while (!exit) {
// System.out.println("\nMenu:");
// System.out.println("1. Credit (Deposit)");
// System.out.println("2. Debit (Withdraw)");
// System.out.println("3. Exit");
// System.out.print("Enter your choice: ");
// int choice = sc.nextInt();
//
// switch (choice) {
// case 1:
// System.out.print("Enter amount to deposit: ");
// int depositAmount = sc.nextInt();
// maxBalanceAccount.credit(depositAmount);
// System.out.println("Deposited " + depositAmount + " successfully.");
// System.out.println("Updated Balance: " + maxBalanceAccount.getBalance());
// break;
// case 2:
// System.out.print("Enter amount to withdraw: ");
// int withdrawAmount = sc.nextInt();
// maxBalanceAccount.debit(withdrawAmount);
// System.out.println("Withdrawn " + withdrawAmount + " successfully.");
// System.out.println("Updated Balance: " + maxBalanceAccount.getBalance());
// break;
// case 3:
// exit = true;
// System.out.println("Exiting...");
// break;
// default:
// System.out.println("Invalid choice. Please enter again.");
// }