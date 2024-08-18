package com.techlabs.Model;

import com.techlabs.Exceptions.InsufficientBalanceException;

public class Account {
	private int accNumber;
	private String name;
	private double balance;

	public Account(int accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
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

	public void credit(double amount) {
		balance += amount;
		System.out.println("Credited: " + amount + ". New balance: " + balance);
	}

	public void debit(double amount) throws InsufficientBalanceException {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Debited: " + amount + ". New balance: " + balance);
		} else {
			throw new InsufficientBalanceException("Insufficient balance.");
		}
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
