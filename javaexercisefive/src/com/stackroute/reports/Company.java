package com.stackroute.reports;

public class Company implements Result{
	
	private int id;
	private String name;
	private int batches;
	
	public Company (int id,String name,int count) {
		this.id = id;
		this.name = name;
		this.batches = count ;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBatches() {
		return batches;
	}
	public void setBatches(int batches) {
		this.batches = batches;
	}
	
	
	public String displayCompanyData() {
		return "Company [id=" + id + ", name=" + name + ", batches=" + batches + "]";
	}
	
}
