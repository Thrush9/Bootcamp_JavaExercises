package com.stackroute.java8.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Countries {

	public static List<String> countries = new ArrayList<>();
	public static Map<String, String> countryCapitals = new HashMap<>();
	public static ArrayList<String> arraylist  = new ArrayList<>();

	static {
		countries.add("Nepal");
		countries.add("India");
		countries.add("Australia");
		countries.add("England");
		countries.add("South Africa");
		countryCapitals.put(countries.get(0), "Kathmandu");
		countryCapitals.put(countries.get(1), "New Delhi");
		countryCapitals.put(countries.get(2), "Canberra");
		countryCapitals.put(countries.get(3), "London");
		countryCapitals.put(countries.get(4), "Cape Town");
	}

	public static void displayCountries(List<String> list) {
		Consumer<String> consumer = (String name) -> System.out.println(name);
//      list.forEach(consumer);
		list.forEach((String name) -> System.out.println(name));
	}

	public static void displayCountryCapitals(Map<String, String> countryMap) {
		BiConsumer<String, String> biconsumer = (String one, String two) -> System.out.println(one + ":" + two);
//		countryMap.forEach(biconsumer);
		countryMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}

	public static void sortCountriesByName(List<String> list) {
		Comparator<String> nameComp = (String one, String two) -> two.compareTo(one);
		list.sort(nameComp);
		list.forEach(System.out::println);
	}

	public static void sortCountriesBylength(List<String> list) {
		Comparator<String> lengthComp = (String one, String two) -> {
			if (two.length() == one.length())
				return one.compareTo(two);
			else if (two.length() > one.length())
				return 1;
			else
				return -1;
		};
		list.sort(lengthComp);
		list.forEach(System.out::println);
	}
	
	public static void removeCountry(String name) {
		//System.out.println(name);
		Predicate<String> checkLength = (country) -> country.length() > 6 ; 
		arraylist.add(name);
	    arraylist.removeIf(checkLength);
	}
	

	public static void main(String[] args) {

		System.out.println("Country List");
		displayCountries(countries);

		System.out.println("\nCountry-Capital List");
		displayCountryCapitals(countryCapitals);

		System.out.println("\nSorted Country List");
		sortCountriesByName(countries);
		
		System.out.println("\nSorted Country By Length List");
		sortCountriesBylength(countries);
		
		System.out.println("\nCountry(with length <=6) List");
		countries.forEach((name) -> removeCountry(name));
		arraylist.forEach(System.out::println);
		//System.out.println(countries);
	}

}
