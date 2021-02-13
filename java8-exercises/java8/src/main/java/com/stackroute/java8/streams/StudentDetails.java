package com.stackroute.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

	public static List<Student> studentList = new ArrayList<>();

	static {
	University svu = new University("SVU", "Tirupathi");
	University ou = new University("OU", "Hyderabad");
	University jntu = new University("JNTU", "Kakinada");
	
	studentList.add(new Student("Naresh", "Maths", "SVCE", 2, svu));
	studentList.add(new Student("Suresh", "Science", "CBIT", 14, ou));
	studentList.add(new Student("Mahesh", "Maths", "SVCE", 3, svu));
	studentList.add(new Student("Ramesh", "Arts", "KBC", 23, ou));
	studentList.add(new Student("Umesh", "Arts", "Vignan", 1, jntu));
	}
}
