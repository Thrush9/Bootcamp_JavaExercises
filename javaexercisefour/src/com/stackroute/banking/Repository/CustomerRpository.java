package com.stackroute.banking.Repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.banking.Model.Customer;

public class CustomerRpository implements iCustomerRepository {

	List<Customer> existingCustomers = new ArrayList<>();

	public CustomerRpository() {
		Customer c1 = new Customer("Isha", "Current", 10000);
		Customer c2 = new Customer("Anant", "Savings", 100000);
		Customer c3 = new Customer("Akash", "Current", 50000);

		existingCustomers.add(c1);
		existingCustomers.add(c2);
		existingCustomers.add(c3);
	}

	public List<Customer> getAllCustomersData() {
		return existingCustomers;
	}

	@Override
	public void addCustomer(Customer customer) {
		existingCustomers.add(customer);
	}

	@Override
	public Customer createCustomer(String name, String type, int amt) {
		Customer newCustomer = new Customer(name,type,amt);
		return newCustomer;
	}

	@Override
	public Customer getCustomerByName(String name) {
		Customer exist = null;
		for (Customer c : existingCustomers) {
			if (c.getCustomerName().toLowerCase().equals(name.toLowerCase())) {
				exist = c;
			}
		}
		
		return exist;
	}
}
