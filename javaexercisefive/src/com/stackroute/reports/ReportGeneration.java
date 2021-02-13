package com.stackroute.reports;

public class ReportGeneration {

	public static String printData(Result results) {
		if (results instanceof Author) {
			System.out.println("\nAuthor Report Generated");
			return ((Author) results).displayAuthorData();
		} else if (results instanceof Company) {
			System.out.println("\nCompany Report Generated");
			return ((Company) results).displayCompanyData();
		} else if (results instanceof Candidate) {
			System.out.println("\nCandidate Report Generated");
			return ((Candidate) results).displayDetails();
		}
		return "None";
	}

	
	public static void main(String[] args) {

		 String output;
		Result result1 = new Author(1,"SS George",5);
		  output = printData(result1);
		 System.out.println(output);
		 Result result2 = new Company(1,"Constructions",15);
		  output = printData(result2);
		 System.out.println(output);
		 Result result3 = new Candidate(1,"Mason",5);
		  output = printData(result3);
		 System.out.println(output);

	}

}
