package com.stackroute.java8.Collectors;

public class Player {
	
	private String playerName;
	private int matchesPlayed;
	private int runs;
	private int highestScore;
	private Country country;
	
	public Player (String name,int matches,int runs,int highest,Country country) {
		this.playerName = name;
		this.matchesPlayed = matches;
		this.runs = runs;
		this.highestScore = highest;
		this.country = country;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getHighestScore() {
		return highestScore;
	}
	
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runs=" + runs
				+ ", highestScore=" + highestScore + ", country=" + country + "]";
	}
	
	

}
