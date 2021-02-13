package com.stackroute.principleTwo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerInfo {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Address addr = new Address(1, "churuch st", "Philedalphia", "USA", 987432);
		Product prod = new Product(101, "Techsol", 5000) ;
		List<Product> list = new ArrayList<>();
		list.add(prod);
		Structure level = new Structure("Reliance", "IT", 5000);
		
		System.out.println("Enter Customer Type");
		String type = scan.next();
		if (type.toLowerCase().equals("normal")) {
			PotentialCustomer cus = new PotentialCustomer("Thrush", "4578740688", "End User", addr, prod);
			Address add = cus.getAddress();
			System.out.println(add.toString());
		} else if (type.toLowerCase().equals("retail")) {
			RetailCustomer cus1 = new RetailCustomer("Surya", "8476524567", "Business Operator", addr, list);
			Boolean status = cus1.validateCustomer();
			System.out.println(status);
		} else if (type.toLowerCase().equals("corporate")) {
			CorporateCustomer cus2 = new CorporateCustomer("Ambani", "9090909090", "Marketing Head", addr, list, level);
			Structure check = cus2.getCustomerStructure();
			System.out.println(check.toString());
		}
		
		scan.close();
	}

}
