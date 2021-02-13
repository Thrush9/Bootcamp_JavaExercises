package com.stackroute.java8.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlayerStats {

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
	
	public static void getPlayersByCountry() {
		Map<String,List<Player>> countryPlayermap = playerList.stream()
				.collect(Collectors.groupingBy((play)->play.getCountry().getCountryName(), Collectors.toList()));
		countryPlayermap.forEach((k,v)->System.out.println(k + "---->" + v));
	}
	
	public static void getPlayerNamesByCountry() {
		Map<String,List<String>> countryPlayermap = playerList.stream().filter((play)->play.getMatchesPlayed()>100)
				.collect(Collectors.groupingBy((play)->play.getCountry().getCountryName(),
				Collectors.mapping( (play)->play.getPlayerName(),Collectors.toList())));
		countryPlayermap.forEach((k,v)->System.out.println(k + "---->" + v));
	}
	
	public static void getTotalPlayersByCountry() {
		LinkedHashMap<String,Long> countryPlayermap = playerList.stream()
	             .collect(Collectors.groupingBy((play)->play.getCountry().getCountryName(),LinkedHashMap::new,Collectors.counting()));
		countryPlayermap.forEach((k,v)->System.out.println(k + "---->" + v));
	}
	
	public static void getTotalRunsByCountry() {
		Map<String,Integer> countryPlayermap = playerList.stream()
				.collect(Collectors.groupingBy((play)->play.getCountry().getCountryName(),
				Collectors.mapping( (play)->play.getRuns(),Collectors.summingInt(mapper -> mapper))));
		countryPlayermap.forEach((k,v)->System.out.println(k + "---->" + v));		
	}
	
	public static void getMaxScoreByCountry() {
		//Function<Optional<Player>,Integer> test = (play)-> play.get().getHighestScore() ;
		Map<Object, Optional<Player>> countryPlayermap = playerList.stream()
				.collect(Collectors.groupingBy((play)->play.getCountry().getCountryName(),
						Collectors.maxBy(Comparator.comparing(Player::getHighestScore))));
	   countryPlayermap.forEach((k,v)->System.out.println(k + "---->" + v.get().getHighestScore()));
	}
	
	public static void getPlayerNamesStringByCountry() {
		Map<String,String> countryPlayermap = playerList.stream()
				.collect(Collectors.groupingBy((play)->play.getCountry().getCountryName(),
				Collectors.mapping( (play)->play.getPlayerName(),Collectors.joining(","))));
		countryPlayermap.forEach((k,v)->System.out.println(k + "---->" + v));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Country wise Player List");
		getPlayersByCountry();
		
		System.out.println("\nCountry wise Player List - with matches > 100");
		getPlayerNamesByCountry();
		
		System.out.println("\nCountry wise Total Players List");
		getTotalPlayersByCountry();
		
		System.out.println("\nCountry wise Total Runs List");
		getTotalRunsByCountry();
		
		System.out.println("\nCountry wise Highest Runs List");
		getMaxScoreByCountry();
		
		System.out.println("\nCountry wise Players Name");
		getPlayerNamesStringByCountry();
	}

}
