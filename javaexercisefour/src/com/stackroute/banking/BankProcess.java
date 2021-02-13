package com.stackroute.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.stackroute.banking.Exception.CustomerNotFoundException;
import com.stackroute.banking.Model.Customer;
import com.stackroute.banking.Repository.CustomerRpository;
import com.stackroute.banking.Repository.iCustomerRepository;
import com.stackroute.banking.Servixe.CustomerService;
import com.stackroute.banking.Servixe.iCustomerService;

public class BankProcess {

	public static void main(String[] args) {
		
		iCustomerService customerservice = new CustomerService();
		Scanner scan = new Scanner(System.in);
		
		int ans = 0;
		while (ans == 0) {
			System.out.println("\n1 - Add Customer \n2 - Delete Customer \n3 - Modify Customer \n4 - View Customer \n5 - Withdraw Amount");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Customer Name");
				String addname = scan.next();
				System.out.println("Enter Customer Type");
				String addtype = scan.next();
				System.out.println("Enter Customer BaseAMount");
				int addamt = scan.nextInt();
				Customer token = customerservice.createCustomer(addname, addtype, addamt);
				customerservice.addCustomerDetails(token);
				System.out.println("Customer Added Succesfully");
				break;
			case 2:
				System.out.println("Enter Customer Name");
				String delname = scan.next();
				try {
					customerservice.deleteCustomer(delname);
					System.out.println("Customer Deleted Succesfully");
				} catch (CustomerNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter Customer Name");
				String modname = scan.next();
				System.out.println("Enter Customer DepositType");
				String modtype = scan.next();
				Customer source = customerservice.createCustomer(modname, modtype, 0);
				try {
					customerservice.modifyCustomer(source);
					System.out.println("Customer Modified Succesfully");
				} catch (CustomerNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;	
			case 4:
				List<Customer> existingList = customerservice.getCustomers();
				if (!existingList.isEmpty()) {
					System.out.println("Customer Details");
					for (Customer person : existingList) {
						System.out.println(person.toString());
					}
				} else  {
					System.out.println("The List is empty");
				}
				break;
			case 5:
				System.out.println("Enter Customer Name");
				String name = scan.next();
				System.out.println("Enter Wihdrawal Amount");
				int amt = scan.nextInt();
				Customer target = customerservice.createCustomer(name, "", 0);
				customerservice.withdrawAmout(target, amt);
				break;
			default:
				break;
			} // switch ends
			
			System.out.println("\nWnat to continue 0-yes , 1 -no");
			ans = scan.nextInt();
		}

	}
}
