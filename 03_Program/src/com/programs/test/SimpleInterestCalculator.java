package com.programs.test;

public class SimpleInterestCalculator {
	public static void main(String[] args) {
		int principal_amount = Integer.parseInt(args[0]);
		double rate_of_interest = Double.parseDouble(args[1]);
		int time = Integer.parseInt(args[2]);

		double simple_interest = (principal_amount * rate_of_interest * time) / 100;

		System.out.print("The Simple Interest is :- " + simple_interest);
	}
}
