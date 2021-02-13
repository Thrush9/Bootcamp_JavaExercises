package com.stackroute.java8.NIOfiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NIO2Exercise {

	public static Tablet[] tablets;
	public static List<Tablet> tabletList = new ArrayList<>();

	public static void convertFileDataToObject(List<String> filelist) {
		tablets = new Tablet[filelist.size()];
		DateTimeFormatter dtpattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int i = 0;
		for (String row : filelist) {
			String data[] = row.split(",");
			tablets[i] = new Tablet(data[0], data[1], LocalDate.parse(data[2],dtpattern),
					LocalDate.parse(data[3],dtpattern));
			i++;
		}
	}

	public static void getExpiredTablets(String file, String manufacturer) throws IOException {

		Path path = Paths.get(file);
		BufferedReader breader = Files.newBufferedReader(path);
		Stream<String> filedata = breader.lines();

		Predicate<String> filerows = s -> s.contains("name");
		List<String> filelist = filedata.filter(filerows.negate()).collect(Collectors.toList());
		System.out.println("File Data");
		filelist.forEach(System.out::println);

		convertFileDataToObject(filelist);
		tabletList = Arrays.asList(tablets);

		DateTimeFormatter toFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Predicate<Tablet> checkComp = tab -> tab.getManufacturer().equalsIgnoreCase(manufacturer);
		Predicate<Tablet> checkExpiry = tab -> tab.getExpDate().isBefore(LocalDate.now());
		Predicate<Tablet> checkCond = checkComp.and(checkExpiry);
		Map<String, Object> expiredTablets = tabletList.stream().filter(checkCond)
				.collect(Collectors.toMap(Tablet::getName, tab->tab.getExpDate().format(toFormat)));
		System.out.println("\nExpired Tablets List");
		expiredTablets.forEach( (k,v) ->  System.out.println( k + "----->" + v ));
	}

	public static void main(String[] args) throws IOException {
		String file = "tabletdata.csv";
		String manufacturer = "dolo";
		getExpiredTablets(file, manufacturer);
	}

}
