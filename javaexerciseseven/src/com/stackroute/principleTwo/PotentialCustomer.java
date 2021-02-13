package com.stackroute.principleTwo;

public class PotentialCustomer implements iCustomer{

	private String name;
	private String phone;
	private String occupation;
	private Address address;
	private Product product;
	
	public PotentialCustomer(String name,String phn,String job,Address addr,Product prod) {
		this.name = name;
		this.phone = phn;
		this.occupation = job;
		this.address = addr;
		this.product = prod;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public boolean validateCustomer() {
		System.out.println("Validate Potential Customer");
		return false;
	}

	@Override
	public Address getCustomerAddress() {
		Address addr = getAddress();
		return addr;
	}

}
