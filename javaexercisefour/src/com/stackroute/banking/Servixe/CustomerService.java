package com.stackroute.banking.Servixe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.stackroute.banking.Exception.CustomerNotFoundException;
import com.stackroute.banking.Model.Customer;
import com.stackroute.banking.Repository.CustomerRpository;
import com.stackroute.banking.Repository.iCustomerRepository;

public class CustomerService implements iCustomerService{
	
	 iCustomerRepository customerrepo = new CustomerRpository();
	
	public List<Customer> getCustomers(){
		List<Customer> customerList = new ArrayList<>();
		customerList = customerrepo.getAllCustomersData();
		return customerList;
	}

	@Override
	public void addCustomerDetails(Customer customer) {
		customerrepo.addCustomer(customer);
	}

	@Override
	public void withdrawAmout(Customer target, int amount) {
		int balance = 0, result;
		List<Customer> customerList = customerrepo.getAllCustomersData();
		for (Customer c : customerList) {
			if (c.getCustomerName().toLowerCase().equals(target.getCustomerName().toLowerCase())) {
				balance = c.getBaseAmount();
			}
		}
		if (balance != 0) {
			if (balance > 0 && balance > amount) {
				result = balance - amount;
				System.out.println("Available Balance : " + result);
			} else
				System.out.println("Insuffient Balance");
		} else
			System.out.println("Invalid Customer");
	}

	@Override
	public Customer createCustomer(String name, String type, int amt) {
		Customer cus = customerrepo.createCustomer(name, type, amt);
		return cus;
	}

	@Override
	public void deleteCustomer(String name) throws CustomerNotFoundException {
		List<Customer> customerList = customerrepo.getAllCustomersData();
		Customer checkExist = customerrepo.getCustomerByName(name);
		if (checkExist != null) {
			ListIterator<Customer> lstiterator = customerList.listIterator();
			while (lstiterator.hasNext()) {
				Customer obj = lstiterator.next();
				if (obj.getCustomerName().toLowerCase().equals(name.toLowerCase())) {
					lstiterator.remove();
				}
			}
		} else
			throw new CustomerNotFoundException("Customer Not Found");
	}

	@Override
	public void modifyCustomer(Customer customer) throws CustomerNotFoundException {
		List<Customer> customerList = customerrepo.getAllCustomersData();
		Customer checkExist = customerrepo.getCustomerByName(customer.getCustomerName());
		if (checkExist != null) {
			ListIterator<Customer> lstiterator = customerList.listIterator();
			while (lstiterator.hasNext()) {
				Customer obj = lstiterator.next();
				if (obj.getCustomerName().toLowerCase().equals(customer.getCustomerName().toLowerCase())) {
					obj.setDepositType(customer.getDepositType());
				}
			}
		} else
			throw new CustomerNotFoundException("Customer Not Found");
		
	}

}
