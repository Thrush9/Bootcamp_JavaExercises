package com.stackroute.java8.DateTimeAssignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DateTimeExercise {

	public static List<Tablet> tabletList = new ArrayList<>();

	static {
		Tablet dolo = new Tablet("Dolo", "D-pharma", LocalDate.of(2020, 10, 15), LocalDate.of(2020, 12, 05));
		Tablet vicks = new Tablet("Vicks", "V-pharma", LocalDate.of(2019, 9, 30), LocalDate.of(2020, 10, 28));
		Tablet paracetemol = new Tablet("Paracetemol", "P-pharma", LocalDate.of(2020, 01, 21),
				LocalDate.of(2020, 10, 31));
		Tablet saridon = new Tablet("Saridon", "S-pharma", LocalDate.of(2020, 03, 12), LocalDate.of(2020, 11, 22));
		Tablet avil = new Tablet("Avil", "D-pharma", LocalDate.of(2020, 06, 10), LocalDate.of(2021, 9, 20));

		tabletList.add(dolo);
		tabletList.add(vicks);
		tabletList.add(paracetemol);
		tabletList.add(saridon);
		tabletList.add(avil);
	}

	public static List<String> getExpiringTables(int months) {
		LocalDate today = LocalDate.now();
		LocalDate limitDate = today.plusMonths(months);
		List<String> expiredList = tabletList.stream()
				.filter(tablet -> tablet.getExpDate().isAfter(today) && tablet.getExpDate().isBefore(limitDate))
				.map(tablet -> tablet.getName()).collect(Collectors.toList());
		expiredList.forEach(System.out::println);
		return expiredList;
	}

	public static List<Tablet> getExpiringTabletsSorted() {
		List<Tablet> sortedList = tabletList.stream().sorted(Comparator.comparing(Tablet::getExpDate))
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		return sortedList;
	}

	public static Map<String, String> getTabletExpiryPeriod() {
		Function<Tablet, String> timePeriod = tablet -> {
			Period diff = Period.between(tablet.getMfdDate(), tablet.getExpDate());
			return String.valueOf(diff.getYears()) + " year/s " + String.valueOf(diff.getMonths()) + " Month/s "
					+ String.valueOf(diff.getDays()) + " Day/s ";
		};
		Map<String, String> tabletsMap = tabletList.stream().collect(Collectors.toMap(Tablet::getName, timePeriod));
		tabletsMap.forEach((k, v) -> System.out.println(k + " ----> " + v));
		return tabletsMap;
	}

	public static Map<String, List<String>> getSameYearExpiry() {
		LocalDate today = LocalDate.now();
		Map<String, List<String>> sameManufacturerMap = tabletList.stream()
				.filter(tablet -> tablet.getExpDate().isBefore(today) && (tablet.getMfdDate().getYear() == today.getYear()))
				.collect(Collectors.groupingBy(Tablet::getManufacturer, Collectors.mapping(Tablet::getName, Collectors.toList())));
		sameManufacturerMap.forEach((k, v) -> System.out.println(k + " ----> " + v));
		return sameManufacturerMap;
	}

	public static void main(String[] args) {

		System.out.println("Expiring Tablets in given Months");
		getExpiringTables(3);

		System.out.println("\nTablets in Ascending Expiry Date");
		getExpiringTabletsSorted();

		System.out.println("\nTablets with Expiry Period");
		getTabletExpiryPeriod();

		System.out.println("\nTablets with Same Manufacturer in Current Year");
		getSameYearExpiry();
	}

}
