package com.stackroute.java8.streamAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PlayerStatistics {

	public static List<Player> playerList = new ArrayList<>();
	public static List<Country> countryList = new ArrayList<>();

	static {
		Country ind = new Country(1, "India");
		Country eng = new Country(2, "England");
		Country aus = new Country(3, "Australia");

		playerList.add(new Player("Dhawan", 140, 4750, 148, ind));
		playerList.add(new Player("Rohit", 189, 9750, 264, ind));
		playerList.add(new Player("Virat", 201, 11750, 183, ind));
		playerList.add(new Player("Morgan", 204, 9550, 122, eng));
		playerList.add(new Player("Root", 142, 4750, 159, eng));
		playerList.add(new Player("Butler", 133, 6750, 180, eng));
		playerList.add(new Player("Warner", 163, 7750, 175, aus));
		playerList.add(new Player("Maxwell", 119, 3750, 114, aus));
	}

	public static void displayPlayers() {
		List<String> players = playerList.stream().map((play) -> play.getPlayerName()).collect(Collectors.toList());
		players.forEach(System.out::println);
	}

	public static void displayPlayersForCountry(String cname) {
		List<String> players = playerList.stream()
				.filter((play) -> play.getCountry().getCountryName().equals(cname) && play.getHighestScore() > 100)
				.map((play) -> play.getPlayerName()).collect(Collectors.toList());
		players.forEach(System.out::println);
	}

	public static void getPlayerNamesInSortedOrder() {
		LinkedList<String> names = playerList.stream().filter((play) -> play.getRuns() > 5000)
				.sorted(Comparator.comparing(Player::getPlayerName).reversed()).map((play) -> play.getPlayerName())
				.collect(Collectors.toCollection(LinkedList::new));
		names.forEach(System.out::println);
	}

	public static void getAverageRunsByCountry(String cname) {
		OptionalDouble avgruns = playerList.stream().filter((play) -> play.getCountry().getCountryName().equals(cname))
				.mapToInt((play) -> play.getRuns()).average();
		System.out.println(avgruns.getAsDouble());
	}

	public static void getPlayerNamesSortedByCountryAndMatchesPlayed() {
		Comparator<Player> compCountry = (p1,p2) -> { 
			 return p1.getCountry().getCountryName().compareTo(p2.getCountry().getCountryName());
		};
		List<String> players = playerList.stream()
				              .sorted(compCountry.thenComparing(Player::getMatchesPlayed))
				              .map((play) -> play.getPlayerName()).collect(Collectors.toList());
		players.forEach(System.out::println);
	}

	public static void getPlayerAndCountry() {
		Map<String, String> playerMap = playerList.stream().filter((play) -> play.getMatchesPlayed() > 200).collect(
				Collectors.toMap((key) -> key.getPlayerName(), (value) -> value.getCountry().getCountryName()));
		playerMap.forEach((key, val) -> System.out.println(key + "----->" + val));
	}

	public static void getMaxRunsPlayer() {
		Optional<Player> maxPlayer = playerList.stream().max(Comparator.comparing(Player::getRuns));
		if(maxPlayer.isPresent())
			System.out.println(maxPlayer.get());
	}
	
	public static void findPlayer(String pname, String cname) {
		List<Player> searchPlayer =  playerList.stream()
				.filter((play) -> play.getPlayerName().equals(pname) && play.getCountry().getCountryName().equals(cname))
				.collect(Collectors.toList());
		if(!searchPlayer.isEmpty())
		searchPlayer.forEach(System.out::println);
		else
			System.out.println("No such player with Name and Country");
	}
	
	public static void checkHighScorerByCountry(String cname) {
		boolean checkPlayer = playerList.stream().filter((play) -> play.getCountry().getCountryName().equals(cname))
				 .anyMatch((play)->play.getRuns()> 10000);
		System.out.println(checkPlayer);
	}

	public static void main(String[] args) {

		System.out.println("Players List");
		displayPlayers();

		System.out.println("\nCountry Players List with HighestScore > 100");
		displayPlayersForCountry("Australia");

		System.out.println("\nPlayers List with Runs > 5000");
		getPlayerNamesInSortedOrder();

		System.out.println("\nAverage Runs By Country");
		getAverageRunsByCountry("India");

		System.out.println("\nPlayer List sorted by Country and Matches Played");
		getPlayerNamesSortedByCountryAndMatchesPlayed();

		System.out.println("\nPlayer-Country List");
		getPlayerAndCountry();

		System.out.println("\nPlayer with Maximum Runs");
		getMaxRunsPlayer();
		
		System.out.println("\nPlayer search with Name and Country ");
		findPlayer("Virat", "India");
		
		System.out.println("\nPlayer with Total runs > 10000 for Country ");
		checkHighScorerByCountry("India");
		
	}

}
