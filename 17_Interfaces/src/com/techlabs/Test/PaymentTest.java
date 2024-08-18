package com.techlabs.Test;
import com.techlabs.Model.*;
public class PaymentTest {
	public static void main(String[] args) {
		CreditCardPayment ccp= new CreditCardPayment();
		PayPalPayment ppp= new PayPalPayment();
		BankTransferPayment btp = new BankTransferPayment();
		

		ccp.payBills();
		ccp.redeem();
		
		ppp.payBills();
		ppp.redeem();
		
		btp.payBills();
		btp.redeem();
		

		
	
	}
}
