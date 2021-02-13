package com.stackroute.java8.streams;

public class Student {

	private String name;
	private String subject;
	private String college;
	private int rank;
	private University university;
	
	public Student(String name,String subject,String college,int rank,University univ) {
		this.name = name;
		this.subject = subject;
		this.college = college;
		this.rank = rank;
		this.university = univ;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public University getUniversity() {
		return university;
	}
	
	public void setUniversity(University university) {
		this.university = university;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", college=" + college + ", rank=" + rank
				+ ", university=" + university + "]";
	}
	
}

