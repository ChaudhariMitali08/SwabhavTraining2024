package com.techlabs.test;

import com.techlabs.model.BankAccount;

import java.util.*;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, name, balance);

        System.out.println("\nDetails:");
        account.displayDetails();

        System.out.println("\nAccount:");
        System.out.println("Enter deposit amount:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter withdrawal amount:");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\nUpdated Details of Account:");
        account.displayDetails();

        System.out.println("\nEnter Account Number for Account 2:");
        int accountNumber2 = sc.nextInt();

        System.out.println("Enter Name for Account 2:");
        String name2 = sc.next();

        System.out.println("Enter Initial Balance for Account 2:");
        double balance2 = sc.nextDouble();

        BankAccount account2 = new BankAccount(accountNumber2, name2, balance2);

        System.out.println("\nDetails of Account 2:");
        account2.displayDetails();

        System.out.println("Account 2:");
        System.out.println("Enter deposit amount for Account 2:");
        double deposit2 = sc.nextDouble();
        account2.deposit(deposit2);

        System.out.println("Enter withdrawal amount for Account 2:");
        double withdraw2 = sc.nextDouble();
        account2.withdraw(withdraw2);

        System.out.println("Updated Details of Account 2:");
        account2.displayDetails();
    }
}