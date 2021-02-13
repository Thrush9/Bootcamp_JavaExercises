package com.stackroute.banking.Repository;

import java.util.List;

import com.stackroute.banking.Model.Customer;

public interface iCustomerRepository {

	public List<Customer> getAllCustomersData();
	
	public void addCustomer(Customer customer);
	
	public Customer createCustomer(String name, String type, int amt);
	
	public Customer getCustomerByName(String name);
}
