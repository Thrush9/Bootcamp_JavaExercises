package com.stackroute.banking.Servixe;

import java.util.List;

import com.stackroute.banking.Exception.CustomerNotFoundException;
import com.stackroute.banking.Model.Customer;

public interface iCustomerService {
	
	public List<Customer> getCustomers();
	
	public void addCustomerDetails(Customer customer);
	
	public void withdrawAmout(Customer customer,int amount);
	
	public Customer createCustomer(String name, String type, int amt);
	
	public void deleteCustomer(String name) throws CustomerNotFoundException ;

	public void modifyCustomer(Customer customer) throws CustomerNotFoundException;
}
