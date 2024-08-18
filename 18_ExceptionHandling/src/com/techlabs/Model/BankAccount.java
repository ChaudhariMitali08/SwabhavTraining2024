package com.techlabs.Model;

import com.techlabs.Exceptions.InsufficientFundsException;
import com.techlabs.Exceptions.NegativeAmountException;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) throws NegativeAmountException {
		if (amount < 0) {
			throw new NegativeAmountException();
		}
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
		if (amount < 0) {
			throw new NegativeAmountException();
		}
		if (amount > balance) {
			throw new InsufficientFundsException();
		}
		balance -= amount;
	}
}
