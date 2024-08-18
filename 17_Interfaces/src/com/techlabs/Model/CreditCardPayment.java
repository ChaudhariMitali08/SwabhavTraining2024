package com.techlabs.Model;

public class CreditCardPayment implements Payment {

	@Override
	public void payBills() {
System.out.println("the paybill is through credit card ");		
	}

	@Override
	public void redeem() {
System.out.println("Redeem is through Credit card ");		
	}
	
}
