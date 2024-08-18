package com.assignment.test;
import java.util.*;
public class CompoundInterestCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter principal amount: ");
		double principal = sc.nextDouble();

		System.out.print("Enter rate of interest: ");
		double rate = sc.nextDouble();

		System.out.print("Enter time: ");
		double time = sc.nextDouble();

		System.out.print("Enter number of times interest is compounded per year: ");
		int n = sc.nextInt();

		double amount = principal * Math.pow((1 + (rate / (n * 100))), (n * time));
		double compoundInterest = amount - principal;

		System.out.println("The compound interest is: " + compoundInterest);
		System.out.println("The amount after " + time + " years is: " + amount);
//
	}
}

