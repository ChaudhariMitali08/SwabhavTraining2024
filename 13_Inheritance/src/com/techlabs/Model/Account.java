package com.techlabs.Model;

public class Account {
	protected int accno;
	protected String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void credit(double amount) {
		balance += amount;
		System.out.println("Amount credited: " + amount);
		System.out.println("New balance: " + balance);
	}

	public void debit(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Amount debited: " + amount);
			System.out.println("New balance: " + balance);
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public void display() {
		System.out.println("Account No: " + accno);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
}








//
// public class Account {
// private int accountNo;
// private String name;
// private int balance;
//
// public Account(int accountNo, String name, int balance) {
// this.accountNo = accountNo;
// this.name = name;
// this.balance = balance;
// }
//
// public int getAccountNo() {
// return accountNo;
// }
//
// public void setAccountNo(int accountNo) {
// this.accountNo = accountNo;
// }
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public int getBalance() {
// return balance;
// }
//
// public void setBalance(int balance) {
// this.balance = balance;
// }
//
// @Override
// public String toString() {
// return "Account [accountNo=" + accountNo + ", name=" + name + ", balance=" +
// balance + "]";
// }
// }
