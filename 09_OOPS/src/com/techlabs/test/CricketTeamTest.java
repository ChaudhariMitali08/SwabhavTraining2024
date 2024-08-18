package com.techlabs.test;

import java.util.Arrays;
import java.util.Scanner;
import com.techlabs.model.*;

public class CricketTeamTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CricketTeam cricket[] = new CricketTeam[4];
		for (int i = 0; i < cricket.length; i++) {

			System.out.println("Enter Player Id: -");
			int playerId = scanner.nextInt();

			System.out.println("Enter Player name: -");
			String name = scanner.next();

			System.out.println("Enter Number of Matches -");
			int numberOfMatches = scanner.nextInt();

			System.out.println("Enter Number of Runs: -");
			int runs = scanner.nextInt();

			System.out.println("Enter Number of Wickets: -");
			int wickets = scanner.nextInt();

			cricket[i] = new CricketTeam(playerId, name, numberOfMatches, runs, wickets);

		}

		 
		Arrays.sort(cricket, (b1, b2) -> Double.compare(b1.calculateAverage(), b2.calculateAverage()));

		System.out.println("Players sorted by Average Runs per Match:");
		for (int i = 0; i < cricket.length; i++) {
			System.out.println("Player Id: " + cricket[i].getPlayerId());
			System.out.println("Player Name: " + cricket[i].getName());
			System.out.println("Number of Matches: " + cricket[i].getNumberOfMatches());
			System.out.println("Runs: " + cricket[i].getRuns());
			System.out.println("Wickets: " + cricket[i].getWickets());
			System.out.println("Average Runs per Match: " + cricket[i].calculateAverage());

		}
		
	}
}







//
// private static CricketTeam findMaximumAveragePlayer(CricketTeam[] cricket) {
// Arrays.sort(cricket, (b1, b2) -> Double.compare(b2.calculateAverage(),
// b1.calculateAverage()));
// return cricket[0];