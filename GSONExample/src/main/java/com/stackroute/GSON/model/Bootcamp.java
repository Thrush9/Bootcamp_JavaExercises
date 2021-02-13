package com.stackroute.GSON.model;

public class Bootcamp {
	
	private String companyName;
	private String subject;
	
	public Bootcamp() {
		
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Bootcamp [companyName=" + companyName + ", subject=" + subject + "]";
	}
	
}
