package com.techlabs.test;

import java.util.Scanner;

public class Evenoddchecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:- ");
		int number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("even");
			return;
		}  
			System.out.println("odd");
		
	}
}