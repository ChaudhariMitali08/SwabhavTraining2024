package com.techlabs.model;

public class BankAccount {
	private double accountNumber;
	private String name;
	private int balance;
	private String accountType;
	public String savings;
	
	public BankAccount(double accountNumber, String name, int balance, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", accountType=" + accountType + "]";
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
}
