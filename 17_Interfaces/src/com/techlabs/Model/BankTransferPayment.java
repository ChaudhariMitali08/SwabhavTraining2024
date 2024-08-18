package com.techlabs.Model;

public class BankTransferPayment implements Payment {

	@Override
	public void payBills() {
		// TODO Auto-generated method stub
		System.out.println("pay bills through bank transfer");
	}

	@Override
	public void redeem() {
		// TODO Auto-generated method stub
		System.out.println("Redeem through bank transfer");
	}

}
