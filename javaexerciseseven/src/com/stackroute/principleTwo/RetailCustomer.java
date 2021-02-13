package com.stackroute.principleTwo;

import java.util.List;

public class RetailCustomer implements iCustomer{
	
	private String name;
	private String phone;
	private String occupation;
	private Address address;
	private List<Product> product;
	
	public RetailCustomer(String name,String phn,String job,Address addr,List<Product> pro) {
		this.name = name;
		this.phone = phn;
		this.occupation = job;
		this.address = addr;
		this.product = pro;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOccupation() {
		return occupation;
	}

	public Address getAddress() {
		return address;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public boolean validateCustomer() {
		System.out.println("Validate Retail Customer");
		return false;
	}

	@Override
	public Address getCustomerAddress() {
		Address addr = getAddress();
		return addr;
	}

}
