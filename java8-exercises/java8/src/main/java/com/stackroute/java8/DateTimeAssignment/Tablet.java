package com.stackroute.java8.DateTimeAssignment;

import java.time.LocalDate;

public class Tablet {

	private String name;
	private String manufacturer;
	private LocalDate mfdDate;
	private LocalDate expDate;
	
	public Tablet(String name,String company,LocalDate sDate,LocalDate eDate) {
		this.name = name;
		this.manufacturer = company;
		this.mfdDate = sDate;
		this.expDate = eDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public LocalDate getMfdDate() {
		return mfdDate;
	}

	public void setMfdDate(LocalDate mfdDate) {
		this.mfdDate = mfdDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "Tablet [name=" + name + ", manufacturer=" + manufacturer + ", mfdDate=" + mfdDate + ", expDate="
				+ expDate + "]";
	}
	
}
