package com.stackroute.reports;

public class Author implements Result{
	
	private int id;
	private String name;
	private int courses;
	
	public Author (int id,String name,int count) {
		this.id = id;
		this.name = name;
		this.courses = count ;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourses() {
		return courses;
	}
	public void setCourses(int courses) {
		this.courses = courses;
	}
	
	public String displayAuthorData() {
		return "Author [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	
}
