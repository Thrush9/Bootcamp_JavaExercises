package com.stackroute.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class UniversityProcess {

	public static List<Student> studentList = StudentDetails.studentList;

	public static void getUniversityStudents(List<Student> list, String name) {
		List<Student> univList = list.stream().filter((stu) -> stu.getUniversity().getName().equals(name))
				                 .collect(Collectors.toList());
		univList.forEach(System.out::println);
	}

	public static void getAverageRankBySubject(List<Student> list, String name) {
		double result = list.stream().filter((stu) -> stu.getSubject().equals(name)).map((stu) -> stu.getRank())
				        .collect(Collectors.averagingInt((avg) -> avg));
		System.out.println(result);
	}

	public static void getBestPerformerByRank(List<Student> list) {
		OptionalInt result = list.stream().mapToInt((stu) -> stu.getRank()).min();
		Optional<Student> resultObj = list.stream().min(Comparator.comparing(Student::getRank));
		if (result.isPresent())
			System.out.println("Rank : " + result.getAsInt());
		if (resultObj.isPresent())
			System.out.println(resultObj.get());
	}

	public static void getTop10Students(List<Student> list) {
		List<String> toppers = list.stream().filter((stu) -> stu.getRank() <= 10)
				               .sorted(Comparator.comparing(Student::getRank)).map((stu) -> stu.getName())
				               .collect(Collectors.toList());
		toppers.forEach(System.out::println);
	}

	public static void getSortedStuentsInCollege(List<Student> list, String name) {
		List<String> students = list.stream().filter((stu) -> stu.getCollege().equals(name))
				                .sorted(Comparator.comparing(Student::getRank)).map((stu) -> stu.getName())
				                .collect(Collectors.toList());
		students.forEach(System.out::println);
	}

	public static void getUniversityStudentsCount(List<Student> list, String name) {
		System.out.println(list.stream().filter((stu) -> stu.getUniversity().getName().equals(name)).count());
	}

	public static void main(String[] args) {

		System.out.println("University Based Student List");
		getUniversityStudents(studentList, "SVU");

		System.out.println("\nAvg rank based on subject");
		getAverageRankBySubject(studentList, "Arts");

		System.out.println("\nBest Performer");
		getBestPerformerByRank(studentList);

		System.out.println("\nTopper's List");
		getTop10Students(studentList);

		System.out.println("\nCollege Wise Rank List");
		getSortedStuentsInCollege(studentList, "SVCE");

		System.out.println("\nUniversity Students Count");
		getUniversityStudentsCount(studentList, "JNTU");

	}

}
