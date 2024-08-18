package com.techlabs.model;

import java.util.Random;
import java.util.Scanner;

public class PigDiceGame {
	private Random random = new Random();
	private int totalScore = 0;
	private int turnCount = 0;
	private int turnScore = 0;

	public static void displayInstructions() {
		System.out.println("Let's Play PIG!\n");
		System.out.println("* See how many turns it takes you to get to 20.");
		System.out.println("* Turn ends when you hold or roll a 1.");
		System.out.println("* If you roll a 1, you lose all points for the turn.");
		System.out.println("* If you hold, you save all points for the turn.\n");
	}

	public void start(Scanner scanner) {
		while (totalScore < 20) {
			turnCount++;
			System.out.println("TURN " + turnCount + ":\n");
			activeturn(scanner);
		}
		System.out.println("You Win! You finished in " + turnCount + " turns!");
		System.out.println("Game over!");
	}

	public void activeturn(Scanner scanner) {
		boolean turnOver = false;
		while (!turnOver) {
			System.out.println("Enter 'r' to roll again, 'h' to hold.");
			String input = scanner.nextLine();
			switch (input) {
			case "r":
				roll(scanner);
				if (turnScore == 0) {
					turnOver = true;
				}
				break;
			case "h":
				hold();
				turnOver = true;
				break;
			default:
				checkInvalid(input);
			}
		}
	}

	public void roll(Scanner scanner) {
		int roll = random.nextInt(6) + 1;
		System.out.println("You rolled: " + roll);
		if (roll == 1) {
			System.out.println("Turn over. No Score\n");
			turnScore = 0;
			return;
		}

		turnScore += roll;
		System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore);
		System.out.println("If you hold, you will have " + (totalScore + turnScore) + " points.");
	}

	public void hold() {
		totalScore += turnScore;
		System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore + "\n");
		turnScore = 0;
	}

	public void checkInvalid(String input) {
		if (!input.equals("r") && !input.equals("h")) {
			System.out.println("Invalid input. Please enter 'r' to roll again or 'h' to hold.");
		}
	}

	public int getTotalScore() {
		return totalScore;
	}

	public int getTurnCount() {
		return turnCount;
	}

}