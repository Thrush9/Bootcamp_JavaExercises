package com.stackroute.java8.Collectors;

public class Country {

	private int countryId;
	private String countryName;
	
	public Country(int id,String name) {
		this.countryId = id;
		this.countryName = name;
	}
	
	public int getCountryId() {
		return countryId;
	}
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return " countryId=" + countryId + ", countryName=" + countryName;
	}

}
