package com.techlabs.Exceptions;

public class NegativeAmountException extends Exception {
	public NegativeAmountException() {
		super("Amount cannot be negative");
	}
}
