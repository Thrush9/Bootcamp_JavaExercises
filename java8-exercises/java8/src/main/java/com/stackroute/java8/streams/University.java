package com.stackroute.java8.streams;

public class University {
	
	private String name;
	private String location;
	
	public University (String name,String place) {
		this.name = name;
		this.location = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "name :" + name + ", location :" + location;
	}
	
}
