package com.stackroute.lamda.vehicle;

public class Vehicle {
	
	private String type;
	private String company; 
	private int price;
	
	public Vehicle(String type,String company,int amt) {
		this.type =type;
		this.company = company;
		this.price = amt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", company=" + company + ", price=" + price + "]";
	}

}
