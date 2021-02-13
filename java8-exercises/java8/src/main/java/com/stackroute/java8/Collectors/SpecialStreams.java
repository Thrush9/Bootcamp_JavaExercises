package com.stackroute.java8.Collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialStreams {

	public static void getSquaresOfThree() {
		LinkedList<Integer> numbers = IntStream.range(20, 50).filter(num -> num % 3 == 0).mapToObj(n -> n * n)
				.collect(Collectors.toCollection(LinkedList::new));
		numbers.forEach(System.out::println);
	}
	
	public static void getMultiplesOfFive() {
		IntStream multiples = IntStream.iterate(5,i->i+5).limit(20);
		int[] arr= multiples.toArray();
		 System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		System.out.println("Squares of 3 multiples between 20 and 50");
		getSquaresOfThree();
		
		System.out.println("\nFirst 20 - 5 multiples ");
		getMultiplesOfFive();

	}

}
