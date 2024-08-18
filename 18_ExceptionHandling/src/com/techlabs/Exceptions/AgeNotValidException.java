package com.techlabs.Exceptions;

public class AgeNotValidException extends Exception{
	public String getMesage() {
		return "Age not Valid. Age must be less than 18";
	}
}