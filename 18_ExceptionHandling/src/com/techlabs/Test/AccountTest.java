package com.techlabs.Test;

import java.util.Scanner;
import com.techlabs.Exceptions.InsufficientFundsException;
import com.techlabs.Model.BankAccount;
import com.techlabs.Exceptions.NegativeAmountException;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Balance: " + account.getBalance());

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful. Current Balance: " + account.getBalance());
                    } catch (NegativeAmountException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful. Current Balance: " + account.getBalance());
                    } catch (NegativeAmountException | InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
