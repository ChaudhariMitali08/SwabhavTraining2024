package com.techlabs.Exceptions;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException() {
		super("Insufficient funds in the account");
	}
}
