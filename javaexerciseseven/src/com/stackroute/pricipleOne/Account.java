package com.stackroute.pricipleOne;

import java.math.BigDecimal;

public class Account implements iBanking{
	
	private int Id;
	private BigDecimal balance;
	
	public Account(int id,BigDecimal amt) {
		this.Id = id;
		this.balance = amt;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public void withdrawal(BigDecimal Amt) {
       System.out.println("Withrawal from Savings Account");		
 	}

	@Override
	public void deposit(BigDecimal Amt) {
		 System.out.println("Deposit in Savings Account");
	}	
	
	
}
