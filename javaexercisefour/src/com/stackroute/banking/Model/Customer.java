package com.stackroute.banking.Model;

public class Customer {
	
	private String customerName;
	private String depositType;
	private int baseAmount;
	
	public Customer(String name, String type, int amt) {
		
		this.customerName = name;
		this.depositType = type;
		this.baseAmount = amt;
		
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDepositType() {
		return depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public int getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(int baseAmount) {
		this.baseAmount = baseAmount;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", depositType=" + depositType + ", baseAmount=" + baseAmount + "]";
	}
	
    
	
}
