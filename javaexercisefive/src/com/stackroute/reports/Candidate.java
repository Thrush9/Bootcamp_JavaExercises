package com.stackroute.reports;

public class Candidate implements Result {
	
	private int id;
	private String name;
	private int batchId;
	
	public Candidate (int id,String name,int rollno) {
		this.id = id;
		this.name = name;
		this.batchId = rollno ;
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
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	
	public String displayDetails() {
		return "Candidate [id=" + id + ", name=" + name + ", batchId=" + batchId + "]";
	}
	
}
