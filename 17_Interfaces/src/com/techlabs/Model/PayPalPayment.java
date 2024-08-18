package com.techlabs.Model;

public class PayPalPayment implements Payment {

	@Override
	public void payBills() {
System.out.println("Pay bills through paypal");		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem through paypal");
	}

}
