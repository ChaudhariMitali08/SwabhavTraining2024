package com.techlabs.model;

public class CricketTeam {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int wickets;

	public CricketTeam() {
		
	}

	public CricketTeam(int playerId,String name,int numberOfMatches,int runs,int wickets) {
		this.playerId=playerId;
		this.name = name;
		this.numberOfMatches=numberOfMatches;
		this.runs=runs;
		this.wickets=wickets;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getWickets() {
		return wickets;
	}

	
	public int calculateAverage() {
		return this.runs/numberOfMatches;
	}
	
}
