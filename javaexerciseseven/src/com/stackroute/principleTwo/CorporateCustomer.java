package com.stackroute.principleTwo;

import java.util.List;

public class CorporateCustomer implements iCustomer,iCorporateCustomer{
	
	private String name;
	private String phone;
	private String occupation;
	private Address address;
	private List<Product> product;
	private Structure customerStructure;
	
	public CorporateCustomer(String name,String phn,String job,Address addr,List<Product> list,Structure level) {
		this.name = name;
		this.phone = phn;
		this.occupation = job;
		this.address = addr;
		this.product = list;
		this.customerStructure = level;
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
	
	public Structure getCustomerStructure() {
		return customerStructure;
	}

	public void setCustomerStructure(Structure customerStructure) {
		this.customerStructure = customerStructure;
	}

	@Override
	public boolean validateCustomer() {
		System.out.println("Validate Corporate Customer");
		return false;
	}

	@Override
	public Address getCustomerAddress() {
		Address addr = getAddress();
		return addr;
	}

	@Override
	public Structure getCustomerStructureDetails() {
		Structure stuct = getCustomerStructure();
		return stuct;
	}

}
