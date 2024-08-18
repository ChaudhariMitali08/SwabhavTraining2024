package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.model.PigDiceGame;

public class PigDiceGameTest {
	public static void main(String[] args) {
		PigDiceGame game = new PigDiceGame();
		PigDiceGame.displayInstructions();

		Scanner scanner = new Scanner(System.in);
		game.start(scanner);
	}
}
