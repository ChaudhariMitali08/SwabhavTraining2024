package com.techlabs.model;

public class BankAccountApp {
	private double accountNumber;
	private String name;
	private int balance;
	private String accountType;
	
	public BankAccountApp() { 
		
	}
	
	public BankAccountApp(int accountNumber,String name,int balance,String accountType) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
		this.accountType=accountType;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
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
	
}