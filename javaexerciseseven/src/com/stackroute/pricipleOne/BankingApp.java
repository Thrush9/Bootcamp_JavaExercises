package com.stackroute.pricipleOne;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankingApp {

	public static iBanking findAccountType() {

		iBanking bankapp = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Account Type");
		String type = scan.next();
		if (type.toLowerCase().equals("savings")) {
			BigDecimal a = new BigDecimal("100000");
			bankapp = new Account(100, a);
		} else if (type.toLowerCase().equals("current")) {
			BigDecimal a = new BigDecimal("100000");
			bankapp = new CurrentAccount(100, a);
		}
		return bankapp;
	}

	public static void main(String[] args) {
		
		iBanking bankAppProcess =  findAccountType();
		BigDecimal dep = new BigDecimal("100000");
		BigDecimal with = new BigDecimal("50000");
		bankAppProcess.deposit(dep);
		bankAppProcess.withdrawal(with);

	}

}
