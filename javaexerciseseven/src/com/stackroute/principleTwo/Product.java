package com.stackroute.principleTwo;

public class Product {
	
	private int Id;
	private String name;
	private double price;
	
	public Product(int id,String name,double rate) {
		this.Id = id;
		this.name = name;
		this.price = rate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}
	
}
