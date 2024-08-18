package com.techlabs.model;

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;

    // Default constructor
//    public BankAccount(int accountNumber , String name2, double balance2) {
//        this.accountNumber = 0;
//        this.name = name;
//        this.balance = 0.0;
//    }

    // Parameterized constructor
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance is " + balance + ".");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance is " + balance + ".");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance is " + balance + ".");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Balance: " + balance);
    }
}